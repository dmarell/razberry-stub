# Z-wave devices

-------------------------------------------------------------------------

## Qubino Flush dimmer
- Inkludera: Tryck på knappen mer än 2s mindre än 6s  (eller tryck på S1 3 gånger)
- Exkludera: Tryck på knappen mer än 6s (eller tryck på S1 5 gånger)
- Reset av alla parametrar: Tryck på knappen mer än 6s

GET http://rpi0:8083/ZAutomation/api/v1/devices?since=1456268386

{
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

GET http://rpi0:8083/ZWaveAPI/Data/1456268352

{
  "controller.data.controllerState": {
    "value": 0,
    "type": "int",
    "invalidateTime": 1455452225,
    "updateTime": 1456268352
  },
  "devices.1.data.neighbours": {
    "value": [
      3,
      5
    ],
    "type": "binary",
    "invalidateTime": 1453412001,
    "updateTime": 1456268352
  },
  "devices.3.data.neighbours": {
    "value": [
      1,
      5
    ],
    "type": "binary",
    "invalidateTime": 1453412889,
    "updateTime": 1456268352
  },
  "devices.3.data.lastSend": {
    "value": 9791937,
    "type": "int",
    "invalidateTime": 1455452226,
    "updateTime": 1456268486
  },
  "devices.3.data.lastReceived": {
    "value": 0,
    "type": "int",
    "invalidateTime": 1453412889,
    "updateTime": 1456268486
  },
  "devices.3.instances.0.commandClasses.38.data.level": {
    "value": 0,
    "type": "int",
    "invalidateTime": 1456268485,
    "updateTime": 1456268486
  },
  "devices.3.instances.0.commandClasses.38.data.prevLevel": {
    "value": 0,
    "type": "int",
    "invalidateTime": 1455452226,
    "updateTime": 1456268486
  },
  "devices.5.data.basicType": {
    "value": 4,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268354
  },
  "devices.5.data.genericType": {
    "value": 64,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268354
  },
  "devices.5.data.specificType": {
    "value": 2,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268354
  },
  "devices.5.data.infoProtocolSpecific": {
    "value": 5430272,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268352
  },
  "devices.5.data.deviceTypeString": {
    "value": "Advanced Door Lock",
    "type": "string",
    "invalidateTime": 1456268350,
    "updateTime": 1456268354
  },
  "devices.5.data.isListening": {
    "value": false,
    "type": "bool",
    "invalidateTime": 1456268350,
    "updateTime": 1456268352
  },
  "devices.5.data.isRouting": {
    "value": true,
    "type": "bool",
    "invalidateTime": 1456268350,
    "updateTime": 1456268352
  },
  "devices.5.data.isAwake": {
    "value": true,
    "type": "bool",
    "invalidateTime": 1456268350,
    "updateTime": 1456268352
  },
  "devices.5.data.optional": {
    "value": true,
    "type": "bool",
    "invalidateTime": 1456268350,
    "updateTime": 1456268352
  },
  "devices.5.data.sensor250": {
    "value": false,
    "type": "bool",
    "invalidateTime": 1456268350,
    "updateTime": 1456268352
  },
  "devices.5.data.sensor1000": {
    "value": true,
    "type": "bool",
    "invalidateTime": 1456268350,
    "updateTime": 1456268352
  },
  "devices.5.data.neighbours": {
    "value": [
      1,
      3
    ],
    "type": "binary",
    "invalidateTime": 1456268350,
    "updateTime": 1456268352
  },
  "devices.5.data.manufacturerId": {
    "value": 270,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268358
  },
  "devices.5.data.vendorString": {
    "value": "",
    "type": "string",
    "invalidateTime": 1456268350,
    "updateTime": 1456268358
  },
  "devices.5.data.manufacturerProductType": {
    "value": 3,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268358
  },
  "devices.5.data.manufacturerProductId": {
    "value": 2,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268358
  },
  "devices.5.data.ZWLib": {
    "value": 3,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268357
  },
  "devices.5.data.ZWProtocolMajor": {
    "value": 2,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268357
  },
  "devices.5.data.ZWProtocolMinor": {
    "value": 78,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268357
  },
  "devices.5.data.SDK": {
    "value": "5.02.03",
    "type": "string",
    "invalidateTime": 1456268350,
    "updateTime": 1456268357
  },
  "devices.5.data.applicationMajor": {
    "value": 2,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268357
  },
  "devices.5.data.applicationMinor": {
    "value": 4,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268357
  },
  "devices.5.data.nodeInfoFrame": {
    "value": [
      114,
      128,
      134,
      152
    ],
    "type": "binary",
    "invalidateTime": 1456268350,
    "updateTime": 1456268354
  },
  "devices.5.data.lastSend": {
    "value": 9782238,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268387
  },
  "devices.5.data.lastNonceGet": {
    "value": null,
    "type": "empty",
    "invalidateTime": 1456268350,
    "updateTime": 1456268387
  },
  "devices.5.data.lastReceived": {
    "value": 0,
    "type": "int",
    "invalidateTime": 1456268350,
    "updateTime": 1456268387
  },
  "devices.5.data.givenName": {
    "value": "Advanced Door Lock_5",
    "type": "string",
    "invalidateTime": 1456268350,
    "updateTime": 1456268353
  },
  "devices.5.data.secureChannelEstablished": {
    "value": true,
    "type": "bool",
    "invalidateTime": 1456268351,
    "updateTime": 1456268353
  },
  "devices.5.instances.0.commandClasses": {
    "32": {
      "name": "Basic",
      "data": {
        "value": null,
        "type": "empty",
        "supported": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268358,
          "updateTime": 1456268352
        },
        "version": {
          "value": 1,
          "type": "int",
          "invalidateTime": 1456268358,
          "updateTime": 1456268354
        },
        "security": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268354
        },
        "interviewDone": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268358
        },
        "interviewCounter": {
          "value": 9,
          "type": "int",
          "invalidateTime": 1456268351,
          "updateTime": 1456268358
        },
        "level": {
          "value": null,
          "type": "empty",
          "invalidateTime": 1456268358,
          "updateTime": 1456268352
        },
        "invalidateTime": 1456268358,
        "updateTime": 1456268352
      }
    },
    "78": {
      "name": "ScheduleEntryLock",
      "data": {
        "value": null,
        "type": "empty",
        "supported": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268354
        },
        "version": {
          "value": 1,
          "type": "int",
          "invalidateTime": 1456268354,
          "updateTime": 1456268356
        },
        "security": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268354
        },
        "interviewDone": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268360
        },
        "interviewCounter": {
          "value": 9,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268358
        },
        "weekDaySlots": {
          "value": 7,
          "type": "int",
          "invalidateTime": 1456268358,
          "updateTime": 1456268360
        },
        "yearSlots": {
          "value": 1,
          "type": "int",
          "invalidateTime": 1456268358,
          "updateTime": 1456268360
        },
        "invalidateTime": 1456268353,
        "updateTime": 1456268354
      }
    },
    "98": {
      "name": "DoorLock",
      "data": {
        "value": null,
        "type": "empty",
        "supported": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268354
        },
        "version": {
          "value": 1,
          "type": "int",
          "invalidateTime": 1456268354,
          "updateTime": 1456268356
        },
        "security": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268354
        },
        "interviewDone": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268359
        },
        "interviewCounter": {
          "value": 9,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268358
        },
        "mode": {
          "value": 0,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268386
        },
        "insideMode": {
          "value": 15,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268386
        },
        "outsideMode": {
          "value": 15,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268386
        },
        "lockMinutes": {
          "value": 254,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268386
        },
        "lockSeconds": {
          "value": 254,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268386
        },
        "condition": {
          "value": 6,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268386
        },
        "insideState": {
          "value": 0,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268360
        },
        "outsideState": {
          "value": 0,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268360
        },
        "timeoutMinutes": {
          "value": 254,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268360
        },
        "timeoutSeconds": {
          "value": 254,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268360
        },
        "opType": {
          "value": 1,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268360
        },
        "invalidateTime": 1456268353,
        "updateTime": 1456268354
      }
    },
    "99": {
      "name": "UserCode",
      "data": {
        "value": null,
        "type": "empty",
        "supported": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268354
        },
        "version": {
          "value": 1,
          "type": "int",
          "invalidateTime": 1456268354,
          "updateTime": 1456268356
        },
        "security": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268354
        },
        "interviewDone": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268360
        },
        "interviewCounter": {
          "value": 9,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268358
        },
        "maxUsers": {
          "value": 20,
          "type": "int",
          "invalidateTime": 1456268358,
          "updateTime": 1456268360
        },
        "invalidateTime": 1456268353,
        "updateTime": 1456268354
      }
    },
    "112": {
      "name": "Configuration",
      "data": {
        "value": null,
        "type": "empty",
        "supported": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268354
        },
        "version": {
          "value": 1,
          "type": "int",
          "invalidateTime": 1456268354,
          "updateTime": 1456268357
        },
        "security": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268354
        },
        "interviewDone": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268358
        },
        "interviewCounter": {
          "value": 9,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268358
        },
        "invalidateTime": 1456268353,
        "updateTime": 1456268354
      }
    },
    "114": {
      "name": "ManufacturerSpecific",
      "data": {
        "value": null,
        "type": "empty",
        "supported": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268358,
          "updateTime": 1456268352
        },
        "version": {
          "value": 1,
          "type": "int",
          "invalidateTime": 1456268358,
          "updateTime": 1456268354
        },
        "security": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268354
        },
        "interviewDone": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268358
        },
        "interviewCounter": {
          "value": 9,
          "type": "int",
          "invalidateTime": 1456268351,
          "updateTime": 1456268358
        },
        "vendorId": {
          "value": 270,
          "type": "int",
          "invalidateTime": 1456268357,
          "updateTime": 1456268358
        },
        "vendor": {
          "value": "",
          "type": "string",
          "invalidateTime": 1456268357,
          "updateTime": 1456268358
        },
        "productId": {
          "value": 2,
          "type": "int",
          "invalidateTime": 1456268357,
          "updateTime": 1456268358
        },
        "productType": {
          "value": 3,
          "type": "int",
          "invalidateTime": 1456268357,
          "updateTime": 1456268358
        },
        "serialNumber": {
          "value": null,
          "type": "empty",
          "invalidateTime": 1456268358,
          "updateTime": 1456268352
        },
        "invalidateTime": 1456268358,
        "updateTime": 1456268352
      }
    },
    "128": {
      "name": "Battery",
      "data": {
        "value": null,
        "type": "empty",
        "supported": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268358,
          "updateTime": 1456268352
        },
        "version": {
          "value": 1,
          "type": "int",
          "invalidateTime": 1456268358,
          "updateTime": 1456268355
        },
        "security": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268354
        },
        "interviewDone": {
          "value": false,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268358
        },
        "interviewCounter": {
          "value": 9,
          "type": "int",
          "invalidateTime": 1456268351,
          "updateTime": 1456268358
        },
        "lastChange": {
          "value": null,
          "type": "empty",
          "invalidateTime": 1456268358,
          "updateTime": 1456268352
        },
        "history": {
          "value": null,
          "type": "empty",
          "invalidateTime": 1456268358,
          "updateTime": 1456268352
        },
        "last": {
          "value": 0,
          "type": "int",
          "invalidateTime": 1456268358,
          "updateTime": 1456268352
        },
        "invalidateTime": 1456268358,
        "updateTime": 1456268352
      }
    },
    "134": {
      "name": "Version",
      "data": {
        "value": null,
        "type": "empty",
        "supported": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268352
        },
        "version": {
          "value": 1,
          "type": "int",
          "invalidateTime": 1456268354,
          "updateTime": 1456268355
        },
        "security": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268354
        },
        "interviewDone": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268357
        },
        "interviewCounter": {
          "value": 9,
          "type": "int",
          "invalidateTime": 1456268351,
          "updateTime": 1456268354
        },
        "ZWLib": {
          "value": 3,
          "type": "int",
          "invalidateTime": 1456268355,
          "updateTime": 1456268357
        },
        "ZWProtocolMajor": {
          "value": 2,
          "type": "int",
          "invalidateTime": 1456268355,
          "updateTime": 1456268357
        },
        "ZWProtocolMinor": {
          "value": 78,
          "type": "int",
          "invalidateTime": 1456268355,
          "updateTime": 1456268357
        },
        "SDK": {
          "value": "5.02.03",
          "type": "string",
          "invalidateTime": 1456268355,
          "updateTime": 1456268357
        },
        "applicationMajor": {
          "value": 2,
          "type": "int",
          "invalidateTime": 1456268355,
          "updateTime": 1456268357
        },
        "applicationMinor": {
          "value": 4,
          "type": "int",
          "invalidateTime": 1456268355,
          "updateTime": 1456268357
        },
        "hardwareVersion": {
          "value": null,
          "type": "empty",
          "invalidateTime": 1456268355,
          "updateTime": 1456268357
        },
        "firmwareCount": {
          "value": 0,
          "type": "int",
          "invalidateTime": 1456268355,
          "updateTime": 1456268357
        },
        "invalidateTime": 1456268355,
        "updateTime": 1456268357
      }
    },
    "138": {
      "name": "Time",
      "data": {
        "value": null,
        "type": "empty",
        "supported": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268354
        },
        "version": {
          "value": 1,
          "type": "int",
          "invalidateTime": 1456268354,
          "updateTime": 1456268357
        },
        "security": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268354
        },
        "interviewDone": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268353,
          "updateTime": 1456268361
        },
        "interviewCounter": {
          "value": 9,
          "type": "int",
          "invalidateTime": 1456268353,
          "updateTime": 1456268358
        },
        "invalidateTime": 1456268353,
        "updateTime": 1456268354
      }
    },
    "152": {
      "name": "Security",
      "data": {
        "value": null,
        "type": "empty",
        "supported": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268352
        },
        "version": {
          "value": 1,
          "type": "int",
          "invalidateTime": 1456268354,
          "updateTime": 1456268355
        },
        "security": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268353
        },
        "interviewDone": {
          "value": true,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268354
        },
        "interviewCounter": {
          "value": 9,
          "type": "int",
          "invalidateTime": 1456268351,
          "updateTime": 1456268352
        },
        "scheme": {
          "value": 0,
          "type": "int",
          "invalidateTime": 1456268351,
          "updateTime": 1456268353
        },
        "secureNodeInfoFrame": {
          "value": [
            98,
            99,
            78,
            112,
            138,
            114,
            128,
            134,
            239
          ],
          "type": "binary",
          "invalidateTime": 1456268353,
          "updateTime": 1456268354
        },
        "securityAbandoned": {
          "value": false,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268352
        },
        "canStream": {
          "value": false,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268352
        },
        "toFollow": {
          "value": false,
          "type": "bool",
          "invalidateTime": 1456268351,
          "updateTime": 1456268387
        },
        "invalidateTime": 1456268351,
        "updateTime": 1456268352
      }
    }
  },
  "updateTime": 1456292934
}
