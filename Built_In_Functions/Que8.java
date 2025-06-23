import java.util.Scanner;

public class Que8 {

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Enter 'F' for Fahrenheit or 'C' for Celsius: ");
        String scale = sc.next().toUpperCase();

        if (scale.equals("F")) {
            System.out.println(temp + " F = " + fahrenheitToCelsius(temp) + " C");
        } else if (scale.equals("C")) {
            System.out.println(temp + " C = " + celsiusToFahrenheit(temp) + " F");
        } else {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}