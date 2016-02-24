package se.marell.razberrystub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevicesController {
    @Autowired
    private DevicesRepository repository;

    @RequestMapping("/devices")
    public DevicesResponse getDevices(@RequestParam(value = "since", defaultValue = "0") long since) {
        return new DevicesResponse(repository.getData());
    }
}
