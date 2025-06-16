import java.util.Scanner;

public class Que27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;

        double targetDistance = 5000;

        double rounds = targetDistance / perimeter;

        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to complete a 5 km run.");

        sc.close();
    }
}
