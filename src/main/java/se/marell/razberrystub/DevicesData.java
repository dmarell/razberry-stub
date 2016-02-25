/*
 * Created by Daniel Marell on 2016-02-24.
 */
package se.marell.razberrystub;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
abstract class DeviceMetrics {
    private String icon;
    private String title;
}

@Data
@EqualsAndHashCode(callSuper = true)
class ZWaveDeviceMetricsIntLevel extends DeviceMetrics {
    public ZWaveDeviceMetricsIntLevel(String icon, String title, int level) {
        super(icon, title);
        this.level = level;
    }
    private int level;
}

@Data
@EqualsAndHashCode(callSuper = true)
class ZWaveDeviceMetricsStringLevel extends DeviceMetrics {
    public ZWaveDeviceMetricsStringLevel(String icon, String title, String level) {
        super(icon, title);
        this.level = level;
    }
    private String level;
}

@Data
@AllArgsConstructor
class ZWaveDevice {
    private long creationTime;
    private int creatorId;
    private String deviceType;
    private long h;
    private boolean hasHistory;
    private String id;
    private int location;
    private DeviceMetrics metrics;
    private boolean permanently_hidden;
    private String probeType;
    private String[] tags;
    private boolean visibility;
    private long updateTime;
}

@Data
@AllArgsConstructor
public class DevicesData {
    private boolean structureChanged;
    private ZWaveDevice[] devices;
    private long updateTime;
    private int code;
    private String message;
    private String error;
}



