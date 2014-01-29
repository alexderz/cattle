from common_fixtures import *  # NOQA
import time


def test_agent_create(admin_client):
    client = admin_client

    uri = "sim://" + str(time.time())

    count = len(client.list_agent())
    account_count = len(client.list_account())
    cred_count = len(client.list_credential())
    agent = client.create_agent(uri=uri)

    assert agent.state == "registering"
    assert agent.uri == uri
    assert agent.transitioning == "yes"

    agent = wait_success(client, agent)

    assert agent.transitioning == "no"
    assert agent.state == "active"

    new_count = len(client.list_agent())
    assert (count+1) == new_count

    new_count = len(client.list_account())
    assert (account_count+1) == new_count

    new_count = len(client.list_credential())
    assert (cred_count+1) == new_count

    account = agent.account()
    assert account.uuid.startswith("agentAccount")
    assert account.state == "active"
    assert account.kind == "agent"

    creds = account.credentials()
    assert len(creds) == 1
    assert creds[0].state == "active"
    assert creds[0].publicValue is not None
    assert creds[0].secretValue is not None
