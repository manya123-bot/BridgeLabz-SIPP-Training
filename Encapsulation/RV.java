abstract class Vehicle {
    private String vehicleNumber, type;
    protected double rate;

    public Vehicle(String n, String t, double r) {
        vehicleNumber = n;
        type = t;
        rate = r;
    }

    public String getType() {
        return type;
    }

    public String getNumber() {
        return vehicleNumber;
    }

    public abstract double calcRental(int days);
}

interface Insurable {
    double calcInsurance();

    String getInsDetails();

    void setPolicy(String p);

    String getPolicy();
}

class Car extends Vehicle implements Insurable {
    private String policy;

    public Car(String no, double r) {
        super(no, "Car", r);
    }

    public double calcRental(int d) {
        return rate * d;
    }

    public double calcInsurance() {
        return 150;
    }

    public String getInsDetails() {
        return "Car ins: $150";
    }

    public void setPolicy(String p) {
        policy = p;
    }

    public String getPolicy() {
        return policy;
    }
}

class Bike extends Vehicle implements Insurable {
    private String policy;

    public Bike(String no, double r) {
        super(no, "Bike", r);
    }

    public double calcRental(int d) {
        return rate * d;
    }

    public double calcInsurance() {
        return 50;
    }

    public String getInsDetails() {
        return "Bike ins: $50";
    }

    public void setPolicy(String p) {
        policy = p;
    }

    public String getPolicy() {
        return policy;
    }
}

class Truck extends Vehicle implements Insurable {
    private String policy;

    public Truck(String no, double r) {
        super(no, "Truck", r);
    }

    public double calcRental(int d) {
        return rate * d * 1.2;
    }

    public double calcInsurance() {
        return 300;
    }

    public String getInsDetails() {
        return "Truck ins: $300";
    }

    public void setPolicy(String p) {
        policy = p;
    }

    public String getPolicy() {
        return policy;
    }
}

public class RV {
    public static void main(String[] args) {
        Vehicle[] cars = {
                new Car("C1", 40), new Bike("B1", 10), new Truck("T1", 100)
        };
        for (Vehicle v : cars) {
            System.out.println(v.getType() + "#" + v.getNumber() + " rental: $" + v.calcRental(5));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance: $" + ins.calcInsurance() + " (" + ins.getInsDetails() + ")");
            }
        }
    }
}