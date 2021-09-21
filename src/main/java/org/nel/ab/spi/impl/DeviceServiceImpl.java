package org.nel.ab.spi.impl;

import org.nel.ab.dto.DeviceDto;
import org.nel.ab.entity.Device;
import org.nel.ab.spi.DeviceService;
import org.keycloak.connections.jpa.JpaConnectionProvider;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.utils.KeycloakModelUtils;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class DeviceServiceImpl implements DeviceService {

    private final KeycloakSession session;

    public DeviceServiceImpl(KeycloakSession session) {
        this.session = session;
        if (getRealm() == null) {
            throw new IllegalStateException("The service cannot accept a session without a realm in its context.");
        }
    }

    @Override
    public List<DeviceDto> listDevices() {
//        List<Device> deviceEntities = getEntityManager().createNativeQuery("SELECT * from DEVICE;").getResultList();
//        List<DeviceDto> result = new ArrayList<>();
//        for(Device entity: deviceEntities){
//            result.add(DeviceDto.builder()
//                    .brand(entity.getBrand())
//                    .model(entity.getModel())
//                    .status(entity.getStatus())
//                    .build());
//        }
        return new ArrayList<>();
    }

    @Override
    public DeviceDto addDevice(DeviceDto dto) {
        getEntityManager().persist(new Device(KeycloakModelUtils.generateId(),dto.getModel(), dto.getBrand(), dto.getStatus()));
        return dto;
    }

    @Override
    public void close() {

    }

    protected RealmModel getRealm() {
        return session.getContext().getRealm();
    }

    private EntityManager getEntityManager() {
        return session.getProvider(JpaConnectionProvider.class).getEntityManager();
    }

}
