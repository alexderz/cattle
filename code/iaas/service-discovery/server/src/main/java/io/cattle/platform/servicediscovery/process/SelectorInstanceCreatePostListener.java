package io.cattle.platform.servicediscovery.process;

import static io.cattle.platform.core.model.tables.ServiceTable.SERVICE;
import io.cattle.platform.core.constants.CommonStatesConstants;
import io.cattle.platform.core.constants.InstanceConstants;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.core.model.Service;
import io.cattle.platform.core.model.ServiceExposeMap;
import io.cattle.platform.engine.handler.HandlerResult;
import io.cattle.platform.engine.handler.ProcessPostListener;
import io.cattle.platform.engine.process.ProcessInstance;
import io.cattle.platform.engine.process.ProcessState;
import io.cattle.platform.lock.LockCallbackNoReturn;
import io.cattle.platform.lock.LockManager;
import io.cattle.platform.object.process.StandardProcess;
import io.cattle.platform.process.common.handler.AbstractObjectProcessLogic;
import io.cattle.platform.servicediscovery.api.dao.ServiceExposeMapDao;
import io.cattle.platform.servicediscovery.deployment.impl.ServiceInstanceLock;
import io.cattle.platform.servicediscovery.service.ServiceDiscoveryService;
import io.cattle.platform.util.type.Priority;

import java.util.List;

import javax.inject.Inject;

public class SelectorInstanceCreatePostListener extends AbstractObjectProcessLogic implements ProcessPostListener,
        Priority {
    @Inject
    ServiceDiscoveryService sdService;

    @Inject
    ServiceExposeMapDao exposeMapDao;

    @Inject
    LockManager lockManager;

    @Override
    public String[] getProcessNames() {
        return new String[] { InstanceConstants.PROCESS_CREATE };
    }

    @Override
    public HandlerResult handle(ProcessState state, ProcessInstance process) {
        final Instance instance = (Instance) state.getResource();
        List<Service> services = objectManager.find(Service.class, SERVICE.ACCOUNT_ID, instance.getAccountId(),
                SERVICE.REMOVED, null);

        for (final Service service : services) {
            if (sdService.isServiceInstance(service, instance)) {
                continue;
            }
            if (sdService.isSelectorContainerMatch(service, instance.getId())) {

                lockManager.lock(new ServiceInstanceLock(service, instance), new LockCallbackNoReturn() {
                    @Override
                    public void doWithLockNoResult() {
                        ServiceExposeMap exposeMap = exposeMapDao.createServiceInstanceMap(service, instance, false);
                        if (exposeMap.getState().equalsIgnoreCase(CommonStatesConstants.REQUESTED)) {
                            objectProcessManager.scheduleStandardProcessAsync(StandardProcess.CREATE, exposeMap,
                                    null);
                        }
                    }
                });

                ServiceExposeMap exposeMap = exposeMapDao.createServiceInstanceMap(service, instance, false);
                if (exposeMap.getState().equalsIgnoreCase(CommonStatesConstants.REQUESTED)) {
                    objectProcessManager.scheduleStandardProcessAsync(StandardProcess.CREATE, exposeMap,
                            null);
                }
            }
        }

        return null;
    }

    @Override
    public int getPriority() {
        return Priority.DEFAULT;
    }
}
