package org.nel.ab.controller;

import org.keycloak.models.KeycloakSession;
import org.keycloak.services.resource.RealmResourceProvider;
import org.nel.ab.dto.DeviceDto;
import org.nel.ab.spi.DeviceService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class DeviceResourceProvider implements RealmResourceProvider {

    private KeycloakSession session;

    public DeviceResourceProvider(KeycloakSession session) {
        this.session = session;
    }

    @Override
    public Object getResource() {
        return this;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DeviceDto> get() {
//        String name = session.getContext().getRealm().getDisplayName();
//        if (name == null) {
//            name = session.getContext().getRealm().getName();
//        }
//        DeviceService service = session.getProvider(DeviceService.class);
        List<DeviceDto> result = new ArrayList<>();
        result.add(DeviceDto.builder().brand("Apple").model("iphone").status("valid").build());
//        List<DeviceDto> result = session.getProvider(DeviceService.class).listDevices();
//        if(result==null || result.size()==0){
//            result = new ArrayList<>();
//        }
        return result;
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response enroll(DeviceDto dto) {
//        session.getProvider(DeviceService.class).addDevice(dto);
//        String name = session.getContext().getRealm().getDisplayName();
//        if (name == null) {
//            name = session.getContext().getRealm().getName();
//        }
        return Response.created(URI.create("done")).build();
    }

    @Override
    public void close() {
    }

}
