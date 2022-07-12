package org.apache.eventmesh.registry.etcd.service;

import org.apache.eventmesh.api.exception.RegistryException;
import org.apache.eventmesh.api.registry.RegistryService;
import org.apache.eventmesh.api.registry.dto.EventMeshDataInfo;
import org.apache.eventmesh.api.registry.dto.EventMeshRegisterInfo;
import org.apache.eventmesh.api.registry.dto.EventMeshUnRegisterInfo;

import java.util.List;
import java.util.Map;

public class EtcdRegistryService implements RegistryService {
    @Override
    public void init() throws RegistryException {

    }

    @Override
    public void start() throws RegistryException {

    }

    @Override
    public void shutdown() throws RegistryException {

    }

    @Override
    public List<EventMeshDataInfo> findEventMeshInfoByCluster(String clusterName) throws RegistryException {
        return null;
    }

    @Override
    public List<EventMeshDataInfo> findAllEventMeshInfo() throws RegistryException {
        return null;
    }

    @Override
    public Map<String, Map<String, Integer>> findEventMeshClientDistributionData(String clusterName, String group, String purpose) throws RegistryException {
        return null;
    }

    @Override
    public void registerMetadata(Map<String, String> metadataMap) {

    }

    @Override
    public boolean register(EventMeshRegisterInfo eventMeshRegisterInfo) throws RegistryException {
        return false;
    }

    @Override
    public boolean unRegister(EventMeshUnRegisterInfo eventMeshUnRegisterInfo) throws RegistryException {
        return false;
    }
}
