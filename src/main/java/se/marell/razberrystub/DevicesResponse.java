/*
 * Created by Daniel Marell on 2016-02-24.
 */
package se.marell.razberrystub;
/*
"data": {
    "structureChanged": false,
    "updateTime": 1456292800,
    "devices": [
      {
        "creationTime": 1453412892,
        "creatorId": 1,
        "deviceType": "switchMultilevel",
        "h": 1107079067,
        "hasHistory": false,
        "id": "ZWayVDev_zway_3-0-38",
        "location": 0,
        "metrics": {
          "icon": "multilevel",
          "title": "Fibar Group Dimmer (3.0)",
          "level": 0
        },
        "permanently_hidden": false,
        "probeType": "dimmer",
        "tags": [],
        "visibility": true,
        "updateTime": 1456268486
      },
      {
        "creationTime": 1456268359,
        "creatorId": 1,
        "deviceType": "doorlock",
        "h": 1164337555,
        "hasHistory": false,
        "id": "ZWayVDev_zway_5-0-98",
        "location": 0,
        "metrics": {
          "level": "open",
          "icon": "door",
          "title": "Door Lock (5.0)"
        },
        "permanently_hidden": false,
        "probeType": "",
        "tags": [],
        "visibility": true,
        "updateTime": 1456268386
      }
    ]
  },
  "code": 200,
  "message": "200 OK",
  "error": null
}

 */
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DevicesResponse {
    private DevicesData data;
}
