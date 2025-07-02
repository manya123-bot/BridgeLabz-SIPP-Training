public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(180, "Petrol", 5),
                new Truck(100, "Diesel", 10),
                new Motorcycle(120, "Petrol")
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
