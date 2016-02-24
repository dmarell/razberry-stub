package se.marell.razberrystub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DevicesController {
    @Autowired
    private DevicesRepository repository;

    @RequestMapping("/devices")
    public DevicesResponse getDevices(@RequestParam(value = "since", defaultValue = "0") long since) {
        List<DevicesDevice> list = repository.getDevices();
        return new DevicesResponse(new DevicesData(
                false,
                list.toArray(new DevicesDevice[list.size()]),
                1456268386,
                200,
                "200 OK",
                null
        ));
    }
}
