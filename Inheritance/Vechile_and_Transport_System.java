class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int speed, String fuel) {
        maxSpeed = speed;
        fuelType = fuel;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + ", Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int s, String f, int cap) {
        super(s, f);
        seatCapacity = cap;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    Truck(int s, String f, double load) {
        super(s, f);
        loadCapacity = load;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(int s, String f) {
        super(s, f);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
    }
}

