from common_fixtures import *  # NOQA
import yaml
from cattle import ApiError


def _create_service(client, env, image_uuid, service_kind):
    labels = {'foo': "bar"}
    if service_kind == "service":
        launch_config = {"imageUuid": image_uuid, "labels": labels}
        service = client.create_service(name=random_str(),
                                        environmentId=env.id,
                                        launchConfig=launch_config)

    elif service_kind == "loadBalancerService":
        launch_config = {"labels": labels}
        service = client.create_loadBalancerService(name=random_str(),
                                                    environmentId=env.id,
                                                    launchConfig=launch_config)

    elif service_kind == "dnsService":
        launch_config = {"labels": labels}
        service = client.create_dnsService(name=random_str(),
                                           environmentId=env.id,
                                           launchConfig=launch_config)

    elif service_kind == "externalService":
        launch_config = {"labels": labels}
        service = client.create_externalService(name=random_str(),
                                                environmentId=env.id,
                                                launchConfig=launch_config,
                                                hostname="a.com")

    return labels, service


def _validate_service_link(client, context, service_kind):
    env = _create_stack(client)

    image_uuid = context.image_uuid
    # use case #1 - service having selector's label,
    # is present when service with selector is created
    labels, service = _create_service(client, env, image_uuid, service_kind)
    service = client.wait_success(service)
    assert service.launchConfig.labels == labels
    launch_config = {"imageUuid": image_uuid}
    service1 = client.create_service(name=random_str(),
                                     environmentId=env.id,
                                     launchConfig=launch_config,
                                     selectorLink="foo=bar")
    service1 = client.wait_success(service1)
    assert service1.selectorLink == "foo=bar"
    _validate_add_service_link(service1, service, client)
    # use case #2 - service having selector's label,
    # is added after service with selector creation
    labels, service2 = _create_service(client, env, image_uuid, service_kind)
    service2 = client.wait_success(service2)
    assert service2.launchConfig.labels == labels
    _validate_add_service_link(service1, service2, client)

    compose_config = env.exportconfig()
    assert compose_config is not None
    document = yaml.load(compose_config.dockerComposeConfig)
    assert len(document[service1.name]['labels']) == 1
    labels = {"io.rancher.service.selector.link": "foo=bar"}
    assert document[service1.name]['labels'] == labels


def test_service_add_service_link_selector(client, context):
    _validate_service_link(client, context, "loadBalancerService")
    _validate_service_link(client, context, "service")
    _validate_service_link(client, context, "dnsService")
    _validate_service_link(client, context, "externalService")


def test_service_add_instance_selector(client, context):
    env = _create_stack(client)

    image_uuid = context.image_uuid

    # use case #1 - instance having selector's label,
    # is present when service with selector is created
    labels = {'foo': "bar"}
    container1 = client.create_container(imageUuid=image_uuid,
                                         startOnCreate=True,
                                         labels=labels)
    container1 = client.wait_success(container1)
    assert container1.state == "running"

    launch_config = {"imageUuid": "rancher/none"}
    service = client.create_service(name=random_str(),
                                    environmentId=env.id,
                                    launchConfig=launch_config,
                                    selectorContainer="foo=bar")
    service = client.wait_success(service)
    assert service.selectorContainer == "foo=bar"

    service = client.wait_success(service.activate())
    assert service.state == "active"
    compose_config = env.exportconfig()
    assert compose_config is not None
    document = yaml.load(compose_config.dockerComposeConfig)
    assert len(document[service.name]['labels']) == 1
    export_labels = {"io.rancher.service.selector.container": "foo=bar"}
    assert document[service.name]['labels'] == export_labels

    wait_for(
        lambda: len(client.list_serviceExposeMap(serviceId=service.id)) == 1
    )
    expose_map = container1.serviceExposeMaps()[0]
    assert expose_map.managed == 0

    # use case #2 - instance having selector's label,
    # is added after service with selector creation
    container2 = client.create_container(imageUuid=image_uuid,
                                         startOnCreate=True,
                                         labels=labels)
    container2 = client.wait_success(container2)
    assert container2.state == "running"
    wait_for(
        lambda: len(client.list_serviceExposeMap(serviceId=service.id)) == 2
    )
    expose_map = container2.serviceExposeMaps()[0]
    assert expose_map.managed == 0


def _create_stack(client):
    env = client.create_environment(name=random_str())
    env = client.wait_success(env)
    assert env.state == "active"
    return env


def test_service_mixed_selector_based_wo_image(client, context):
    env = _create_stack(client)
    image_uuid = context.image_uuid

    labels = {'foo': "barbar"}
    container1 = client.create_container(imageUuid=image_uuid,
                                         startOnCreate=True,
                                         labels=labels)
    container1 = client.wait_success(container1)
    assert container1.state == "running"

    launch_config = {"imageUuid": "rancher/none"}
    service = client.create_service(name=random_str(),
                                    environmentId=env.id,
                                    launchConfig=launch_config,
                                    selectorContainer="foo=barbar")
    service = client.wait_success(service)
    assert service.selectorContainer == "foo=barbar"

    service = client.wait_success(service.activate())
    assert service.state == "active"

    wait_for(
        lambda: len(client.list_serviceExposeMap(serviceId=service.id)) == 1
    )

    # add instance having selector label
    labels = {'foo': "barbar"}
    container2 = client.create_container(imageUuid=image_uuid,
                                         startOnCreate=True,
                                         labels=labels)
    container2 = client.wait_success(container2)
    assert container2.state == "running"
    wait_for(
        lambda: len(client.list_serviceExposeMap(serviceId=service.id)) == 2
    )


def test_service_no_image_no_selector(client, context):
    env = _create_stack(client)

    with pytest.raises(ApiError) as e:
        launch_config = {"imageUuid": "rancher/none"}
        client.create_service(name=random_str(),
                              environmentId=env.id,
                              launchConfig=launch_config)
    assert e.value.error.status == 422
    assert e.value.error.code == 'InvalidOption'


def test_service_upgrade_no_image_selector(client):
    env = _create_stack(client)
    launch_config = {"imageUuid": "rancher/none"}
    svc1 = client.create_service(name=random_str(),
                                 environmentId=env.id,
                                 launchConfig=launch_config,
                                 selectorContainer="foo=barbar")
    svc1 = client.wait_success(svc1)
    svc1 = client.wait_success(svc1.activate())

    with pytest.raises(ApiError) as e:
        svc1.upgrade_action(launchConfig={'labels': {'foo': "bar"}})

    assert e.value.error.status == 422
    assert e.value.error.code == 'InvalidAction'


def test_service_upgrade_mixed_selector(client, context):
    env = _create_stack(client)
    launch_config = {"imageUuid": "rancher/none"}
    svc1 = client.create_service(name=random_str(),
                                 environmentId=env.id,
                                 launchConfig=launch_config,
                                 selectorContainer="foo=barbar")
    svc1 = client.wait_success(svc1)
    svc1 = client.wait_success(svc1.activate())

    with pytest.raises(ApiError) as e:
        svc1.upgrade_action(launchConfig={'labels': {'foo': "bar"}})

    assert e.value.error.status == 422
    assert e.value.error.code == 'InvalidAction'

    image_uuid = context.image_uuid
    launch_config = {"imageUuid": image_uuid}
    svc2 = client.create_service(name=random_str(),
                                 environmentId=env.id,
                                 launchConfig=launch_config,
                                 selectorContainer="foo=barbar")
    svc2 = client.wait_success(svc2)
    svc2 = client.wait_success(svc2.activate())
    svc2.upgrade_action(launchConfig={'labels': {'foo': "bar"}})


def test_service_mixed_selector_based_w_image(client, context):
    env = _create_stack(client)

    image_uuid = context.image_uuid

    labels = {'foo': "test"}
    container1 = client.create_container(imageUuid=image_uuid,
                                         startOnCreate=True,
                                         labels=labels)
    container1 = client.wait_success(container1)
    assert container1.state == "running"

    launch_config = {"imageUuid": image_uuid}
    service = client.create_service(name=random_str(),
                                    environmentId=env.id,
                                    launchConfig=launch_config,
                                    selectorContainer="foo=test")
    service = client.wait_success(service)
    assert service.selectorContainer == "foo=test"

    service = client.wait_success(service.activate())
    assert service.state == "active"

    wait_for(
        lambda: len(client.list_serviceExposeMap(serviceId=service.id,
                                                 state='active')) == 2
    )

    # add instance having selector label
    labels = {'foo': "test"}
    container2 = client.create_container(imageUuid=image_uuid,
                                         startOnCreate=True,
                                         labels=labels)
    container2 = client.wait_success(container2)
    assert container2.state == "running"
    wait_for(
        lambda: len(client.list_serviceExposeMap(serviceId=service.id,
                                                 state='active')) == 3
    )

    # scale up
    service = client.update(service, scale=3)
    service = client.wait_success(service)
    wait_for(
        lambda: len(client.list_serviceExposeMap(serviceId=service.id,
                                                 state='active')) == 5
    )

    # scale down, validate container1 and container2 are still running
    service = client.update(service, scale=1)
    service = client.wait_success(service)
    wait_for(
        lambda: len(client.list_serviceExposeMap(serviceId=service.id,
                                                 state='active')) == 3
    )
    container1 = client.reload(container1)
    assert container1.state == "running"
    container2 = client.reload(container2)
    assert container2.state == "running"

    # remove service, validate not managed instances are still running
    service = client.wait_success(service.remove())
    assert service.state == "removed"
    wait_for(
        lambda: len(client.list_serviceExposeMap(serviceId=service.id,
                                                 state='active')) == 0
    )
    container1 = client.reload(container1)
    assert container1.state == "running"
    container2 = client.reload(container2)
    assert container2.state == "running"


def test_lb_service_add_instance_selector(client, context):
    env = _create_stack(client)

    image_uuid = context.image_uuid

    # use case #1 - instance having selector's label,
    # is present when service with selector is created
    labels = {'foo32': "bar"}
    container1 = client.create_container(imageUuid=image_uuid,
                                         startOnCreate=True,
                                         labels=labels)
    container1 = client.wait_success(container1)
    assert container1.state == "running"

    launch_config = {"imageUuid": "rancher/none"}
    service = client.create_service(name=random_str(),
                                    environmentId=env.id,
                                    launchConfig=launch_config,
                                    selectorContainer="foo32=bar")
    service = client.wait_success(service)
    assert service.selectorContainer == "foo32=bar"
    service = client.wait_success(service.activate(), 120)
    assert service.state == "active"

    wait_for(
        lambda: len(client.list_serviceExposeMap(serviceId=service.id)) == 1
    )

    # register service to lb service
    launch_config = {"imageUuid": image_uuid,
                     "ports": [567, '568:569'],
                     "expose": [9999, '9998:9997']}
    lb_service = client.create_loadBalancerService(name=random_str(),
                                                   environmentId=env.id,
                                                   launchConfig=launch_config)
    lb_service = client.wait_success(lb_service)
    assert lb_service.state == "inactive"
    lb_service = client.wait_success(lb_service.activate(), 120)
    assert lb_service.state == "active"
    service_link = {"serviceId": service.id}
    lb_service = lb_service.addservicelink(serviceLink=service_link)

    # use case #2 - instance having selector's label,
    # is added after service with selector creation
    container2 = client.create_container(imageUuid=image_uuid,
                                         startOnCreate=True,
                                         labels=labels)
    container2 = client.wait_success(container2)
    assert container2.state == "running"
    wait_for(
        lambda: len(client.list_serviceExposeMap(serviceId=service.id)) == 2
    )

    # validate containers got registered to the LB
    _wait_until_target_instance_map_created(client, container1)
    _wait_until_target_instance_map_created(client, container2)


def _validate_add_service_link(service,
                               consumedService, client):
    service_maps = client. \
        list_serviceConsumeMap(serviceId=service.id,
                               consumedServiceId=consumedService.id)

    assert len(service_maps) == 1

    service_map = service_maps[0]
    wait_for_condition(
        client, service_map, _resource_is_active,
        lambda x: 'State is: ' + x.state)


def _resource_is_active(resource):
    return resource.state == 'active'


def _wait_until_target_instance_map_created(client,
                                            container, timeout=30):
    start = time.time()
    target_maps = client. \
        list_loadBalancerTarget(instanceId=container.id)
    while len(target_maps) == 0:
        time.sleep(.5)
        target_maps = super_client. \
            list_loadBalancerTarget(instanceId=container.id)
        if time.time() - start > timeout:
            assert 'Timeout waiting for map creation'
    return target_maps
