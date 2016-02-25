package se.marell.razberrystub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired
    private DevicesRepository repository;

    @RequestMapping(value = "/testapi/set-device-level/{deviceId}", method = RequestMethod.PUT)
    public void setDeviceIntLevel(@PathVariable(value = "deviceId") String deviceId,
                                  @RequestParam String level) {
        repository.setDeviceLevel(deviceId, level);
    }
}
