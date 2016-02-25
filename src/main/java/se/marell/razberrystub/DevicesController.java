package se.marell.razberrystub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DevicesController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DevicesRepository repository;

    @RequestMapping(value = "/ZAutomation/api/v1/devices",  method = RequestMethod.GET)
    public DevicesResponse getDevices(@RequestParam(value = "since", defaultValue = "0") long since,
                                      @RequestHeader String authorization) {
        List<ZWaveDevice> list = repository.getDevices(since);
        ZWaveDevice[] devicesArr = list.toArray(new ZWaveDevice[list.size()]);
        long latestUpdateTime = 0;
        for (ZWaveDevice d : devicesArr) {
            if (d.getUpdateTime() > latestUpdateTime) {
                latestUpdateTime = d.getUpdateTime();
            }
        }
        DevicesData data = new DevicesData(
                false,
                devicesArr,
                latestUpdateTime,
                200,
                "200 OK",
                null);
        return new DevicesResponse(data);
    }
}
