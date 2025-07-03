abstract class Vehicle {
    private String vehicleId, driverName;
    protected double ratePerKm;

    public Vehicle(String id, String driver, double rate) {
        vehicleId = id;
        driverName = driver;
        ratePerKm = rate;
    }

    public String getDetails() {
        return "ID: " + vehicleId + ", Driver: " + driverName;
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();

    void updateLocation();
}

class Car extends Vehicle implements GPS {
    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double dist) {
        return ratePerKm * dist;
    }

    public String getCurrentLocation() {
        return "Lat,Long";
    }

    public void updateLocation() {
        /* update logic */ }
}

class Bike extends Vehicle implements GPS {
    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double dist) {
        return ratePerKm * dist;
    }

    public String getCurrentLocation() {
        return "Lat,Long";
    }

    public void updateLocation() {
        /* update logic */ }
}

class Auto extends Vehicle implements GPS {
    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double dist) {
        return ratePerKm * dist;
    }

    public String getCurrentLocation() {
        return "Lat,Long";
    }

    public void updateLocation() {
        /* update logic */ }
}

public class RideHailing {
    static void printFare(Vehicle v, double dist) {
        System.out.println(v.getDetails() + " Fare: $" + v.calculateFare(dist));
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("V1", "Alice", 1.5),
                new Bike("V2", "Bob", 0.8),
                new Auto("V3", "Charlie", 1.2)
        };
        for (Vehicle v : vehicles) {
            printFare(v, 10);
        }
    }
}