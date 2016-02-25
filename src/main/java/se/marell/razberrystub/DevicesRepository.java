/*
 * Created by Daniel Marell on 2016-02-24.
 */
package se.marell.razberrystub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DevicesRepository {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private List<ZWaveDevice> devices = new ArrayList<>();

    @PostConstruct
    private void init() {
        devices.add(createDeviceDimmer(3));
        devices.add(createDeviceDoorLock(5));
    }

    private ZWaveDevice createDeviceDimmer(int deviceNumber) {
        return new ZWaveDevice(
                getTimestamp(),
                1,
                "switchMultilevel",
                1107079067,
                false,
                "ZWayVDev_zway_" + deviceNumber + "-0-38",
                0,
                new ZWaveDeviceMetricsIntLevel("multilevel", "Fibar Group Dimmer (" + deviceNumber + ".0)", 0),
                false,
                "dimmer",
                new String[]{},
                true,
                getTimestamp()
        );
    }

    private ZWaveDevice createDeviceDoorLock(int deviceNumber) {
        return new ZWaveDevice(
                getTimestamp(),
                1,
                "doorlock",
                1164337555,
                false,
                "ZWayVDev_zway_" + deviceNumber + "-0-98",
                0,
                new ZWaveDeviceMetricsStringLevel("door", "Door Lock (" + deviceNumber + ".0)", "open"),
                false,
                "",
                new String[]{},
                true,
                getTimestamp()
        );
    }

    public List<ZWaveDevice> getDevices(long since) {
        List<ZWaveDevice> out = new ArrayList<>();
        for (ZWaveDevice d : devices) {
            if (d.getUpdateTime() > since) {
                out.add(d);
            }
        }
        return out;
    }

    public void setDeviceLevel(String deviceId, String level) {
        ZWaveDevice d = findDevice(deviceId);
        if (d != null) {
            log.info("setDeviceLevel deviceId: {}, level: {}", deviceId, level);
            if (d.getMetrics() instanceof ZWaveDeviceMetricsIntLevel) {
                ZWaveDeviceMetricsIntLevel m = (ZWaveDeviceMetricsIntLevel) d.getMetrics();
                m.setLevel(Integer.parseInt(level));
                d.setUpdateTime(getTimestamp());
            } else {
                ZWaveDeviceMetricsStringLevel m = (ZWaveDeviceMetricsStringLevel) d.getMetrics();
                m.setLevel(level);
                d.setUpdateTime(getTimestamp());
            }
        }
    }

    private ZWaveDevice findDevice(String deviceId) {
        for (ZWaveDevice d : devices) {
            if (d.getId().equals(deviceId)) {
                return d;
            }
        }
        return null;
    }

    private long getTimestamp() {
        return System.currentTimeMillis() / 1000;
    }
}
