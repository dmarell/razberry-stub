/*
 * Created by Daniel Marell on 2016-02-24.
 */
package se.marell.razberrystub;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DevicesRepository {
    private List<DevicesDevice> devices = new ArrayList<>();

    @PostConstruct
    private void init() {
        devices.add(createDeviceD1());
        devices.add(createDeviceD2());
    }

    private DevicesDevice createDeviceD1() {
        return new DevicesDevice(
                1453412892,
                1,
                "switchMultilevel",
                1107079067,
                false,
                "ZWayVDev_zway_3-0-38",
                0,
                new DeviceMetricsIntLevel("multilevel", "Fibar Group Dimmer (3.0)", 0),
                false,
                "dimmer",
                new String[]{},
                true,
                1456268486
        );
    }

    private DevicesDevice createDeviceD2() {
        return new DevicesDevice(
                1456268359,
                1,
                "doorlock",
                1164337555,
                false,
                "ZWayVDev_zway_5-0-98",
                0,
                new DeviceMetricsStringLevel("door", "Door Lock (5.0)", "open"),
                false,
                "",
                new String[]{},
                true,
                1456268386
        );
    }

    public List<DevicesDevice> getDevices() {
        return devices;
    }
}
