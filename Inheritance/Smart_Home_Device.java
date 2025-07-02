class Device {
    String deviceId;
    String status;

    Device(String id, String s) {
        deviceId = id;
        status = s;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String id, String s, int temp) {
        super(id, s);
        temperatureSetting = temp;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status + ", Temp: " + temperatureSetting + "°C");
    }
}


