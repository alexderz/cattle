package io.github.ibuildthecloud.dstack.allocator.dao.impl;

import static io.github.ibuildthecloud.dstack.core.model.tables.HostTable.*;
import static io.github.ibuildthecloud.dstack.core.model.tables.InstanceHostMapTable.*;
import static io.github.ibuildthecloud.dstack.core.model.tables.StoragePoolHostMapTable.*;
import static io.github.ibuildthecloud.dstack.core.model.tables.StoragePoolTable.*;
import static io.github.ibuildthecloud.dstack.core.model.tables.VolumeStoragePoolMapTable.*;
import io.github.ibuildthecloud.dstack.allocator.dao.AllocatorDao;
import io.github.ibuildthecloud.dstack.allocator.service.AllocationAttempt;
import io.github.ibuildthecloud.dstack.allocator.service.AllocationCandidate;
import io.github.ibuildthecloud.dstack.core.model.Host;
import io.github.ibuildthecloud.dstack.core.model.Instance;
import io.github.ibuildthecloud.dstack.core.model.InstanceHostMap;
import io.github.ibuildthecloud.dstack.core.model.StoragePool;
import io.github.ibuildthecloud.dstack.core.model.Volume;
import io.github.ibuildthecloud.dstack.core.model.VolumeStoragePoolMap;
import io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord;
import io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolRecord;
import io.github.ibuildthecloud.dstack.db.jooq.dao.impl.AbstractJooqDao;
import io.github.ibuildthecloud.dstack.object.ObjectManager;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import o.github.ibuildthecloud.dstack.allocator.util.AllocatorUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllocatorDaoImpl extends AbstractJooqDao implements AllocatorDao {

    private static final Logger log = LoggerFactory.getLogger(AllocatorDaoImpl.class);

    ObjectManager objectManager;

    @Override
    public List<? extends StoragePool> getAssociatedPools(Volume volume) {
        return create()
                .select(STORAGE_POOL.fields())
                .from(STORAGE_POOL)
                .join(VOLUME_STORAGE_POOL_MAP)
                    .on(VOLUME_STORAGE_POOL_MAP.STORAGE_POOL_ID.eq(STORAGE_POOL.ID))
                .where(
                    VOLUME_STORAGE_POOL_MAP.REMOVED.isNull()
                    .and(VOLUME_STORAGE_POOL_MAP.VOLUME_ID.eq(volume.getId())))
                .fetchInto(StoragePoolRecord.class);
    }

    @Override
    public List<? extends Host> getHosts(Instance instance) {
        return create()
                .select(HOST.fields())
                .from(HOST)
                .join(INSTANCE_HOST_MAP)
                    .on(INSTANCE_HOST_MAP.HOST_ID.eq(HOST.ID))
                .where(
                    INSTANCE_HOST_MAP.REMOVED.isNull()
                    .and(INSTANCE_HOST_MAP.INSTANCE_ID.eq(instance.getId())))
                .fetchInto(HostRecord.class);
    }

    @Override
    public List<? extends Host> getHosts(StoragePool pool) {
        return create()
                .select(HOST.fields())
                .from(HOST)
                .join(STORAGE_POOL_HOST_MAP)
                    .on(STORAGE_POOL_HOST_MAP.HOST_ID.eq(HOST.ID))
                .where(STORAGE_POOL_HOST_MAP.REMOVED.isNull()
                    .and(STORAGE_POOL_HOST_MAP.STORAGE_POOL_ID.eq(pool.getId())))
                .fetchInto(HostRecord.class);
    }

    @Override
    public boolean recordCandidate(AllocationAttempt attempt, AllocationCandidate candidate) {
        Set<Long> existingHosts = attempt.getHostIds();
        Set<Long> newHosts = candidate.getHosts();

        if ( existingHosts.size() == 0 ) {
            for ( long hostId : newHosts ) {
                log.info("Associating instance [{}] to host [{}]", attempt.getInstance().getId(), hostId);
                objectManager.create(InstanceHostMap.class,
                        INSTANCE_HOST_MAP.HOST_ID, hostId,
                        INSTANCE_HOST_MAP.INSTANCE_ID, attempt.getInstance().getId());
            }
        } else {
            if ( ! existingHosts.equals(newHosts) ) {
                log.error("Can not move allocated instance [{}], currently {} new {}", attempt.getInstance().getId(),
                        existingHosts, newHosts);
                throw new IllegalStateException("Can not move allocated instance [" + attempt.getInstance().getId()
                        + "], currently " + existingHosts + " new " + newHosts);
            }
        }

        Map<Long,Set<Long>> existingPools = attempt.getPoolIds();
        Map<Long,Set<Long>> newPools = candidate.getPools();

        if ( isEmtpy(existingPools) ) {
            for ( Map.Entry<Long, Set<Long>> entry : newPools.entrySet() ) {
                long volumeId = entry.getKey();
                for ( long poolId : entry.getValue() ) {
                    boolean inRightState = true;
                    for ( Volume v : attempt.getVolumes() ) {
                        if ( v.getId().longValue() == volumeId ) {
                            Boolean stateCheck = AllocatorUtils.checkAllocateState(v.getId(), v.getAllocationState(), "Volume");
                            if ( stateCheck != null && ! stateCheck.booleanValue() ) {
                                log.error("Not assigning volume [{}] to pool [{}] because it is in state [{}]",
                                        v.getId(), poolId, v.getAllocationState());
                                inRightState = false;
                            }
                        }
                    }
                    if ( inRightState ) {
                        log.info("Associating volume [{}] to storage pool [{}]", volumeId, poolId);
                        objectManager.create(VolumeStoragePoolMap.class,
                                VOLUME_STORAGE_POOL_MAP.VOLUME_ID, volumeId,
                                VOLUME_STORAGE_POOL_MAP.STORAGE_POOL_ID, poolId);
                    }
                }
            }
        } else {
            if ( ! existingPools.equals(newPools) ) {
                log.error("Can not move volumes, currently {} new {}", existingPools, newPools);
                throw new IllegalStateException("Can not move volumes, currently " + existingPools + " new " + newPools);
            }
        }

        return true;
    }

    protected boolean isEmtpy(Map<Long,Set<Long>> set) {
        for ( Set<Long> value : set.values() ) {
            if ( value.size() > 0 ) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void releaseAllocation(Instance instance) {
        // Nothing to do?
    }

    @Override
    public void releaseAllocation(Volume volume) {
        // Nothing to do?
    }

    public ObjectManager getObjectManager() {
        return objectManager;
    }

    @Inject
    public void setObjectManager(ObjectManager objectManager) {
        this.objectManager = objectManager;
    }

}