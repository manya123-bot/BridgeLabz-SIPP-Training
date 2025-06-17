import java.util.Scanner;

public class Que26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User inputs for name and cities
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter from city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter to city: ");
        String toCity = sc.nextLine();

        double fromToVia = 0;
        while (true) {
            System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
            if (sc.hasNextDouble()) {
                fromToVia = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                sc.next();
            }
        }

        double viaToFinalCity = 0;
        while (true) {
            System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
            if (sc.hasNextDouble()) {
                viaToFinalCity = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                sc.next();
            }
        }

        double timeFromToVia = 0;
        while (true) {
            System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " (in hours): ");
            if (sc.hasNextDouble()) {
                timeFromToVia = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                sc.next();
            }
        }

        double timeViaToFinal = 0;
        while (true) {
            System.out.print("Enter time taken from " + viaCity + " to " + toCity + " (in hours): ");
            if (sc.hasNextDouble()) {
                timeViaToFinal = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                sc.next();
            }
        }

        System.out.println("\nTravel Summary for " + name + ":");
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total distance: " + (fromToVia + viaToFinalCity) + " miles");
        System.out.println("Total time: " + (timeFromToVia + timeViaToFinal) + " hours");

        double averageSpeed = (fromToVia + viaToFinalCity) / (timeFromToVia + timeViaToFinal);
        System.out.println("Average speed: " + averageSpeed + " miles/hour");

        sc.close();
    }
}
