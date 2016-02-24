/*
 * Created by Daniel Marell on 2016-02-24.
 */
package se.marell.razberrystub;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class DeviceMetrics {
    private String icon;
    private String title;
    private int level;
}

@Data
@AllArgsConstructor
class DevicesDevice {
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
    private DevicesDevice[] devices;
    private long updateTime;
    private int code;
    private String message;
    private String error;
}



