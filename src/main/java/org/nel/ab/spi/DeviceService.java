package org.nel.ab.spi;

import org.nel.ab.dto.DeviceDto;
import org.keycloak.provider.Provider;

import java.util.List;

public interface DeviceService extends Provider {

    List<DeviceDto> listDevices();
    DeviceDto addDevice(DeviceDto dto);
}
