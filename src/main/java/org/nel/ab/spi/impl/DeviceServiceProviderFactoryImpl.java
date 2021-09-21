package org.nel.ab.spi.impl;

import org.nel.ab.spi.DeviceService;
import org.nel.ab.spi.DeviceServiceProviderFactory;
import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class DeviceServiceProviderFactoryImpl implements DeviceServiceProviderFactory {
    @Override
    public DeviceService create(KeycloakSession keycloakSession) {
        return null;
    }

    @Override
    public void init(Config.Scope scope) {

    }

    @Override
    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {

    }

    @Override
    public void close() {

    }

    @Override
    public String getId() {
        return "deviceServiceImpl";
    }
}
