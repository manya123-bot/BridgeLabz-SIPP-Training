import java.util.Scanner;

public class Que30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        double m;
        if (x2 != x1) {
            m = (y2 - y1) / (x2 - x1);
        } else {
            m = Double.POSITIVE_INFINITY;
        }

        double b;
        if (x2 != x1) {
            b = y1 - m * x1;
        } else {
            b = Double.NaN;
        }

        String lineEquation;
        if (x2 != x1) {
            lineEquation = "y = " + m + " * x + " + b;
        } else {
            lineEquation = "x = " + x1;
        }

        System.out.printf("Euclidean Distance: %.4f\n", distance);
        if (x2 != x1) {
            System.out.printf("Line Equation: %s\n", lineEquation);
            System.out.printf("Slope (m): %.4f\n", m);
            System.out.printf("Y-intercept (b): %.4f\n", b);
        } else {
            System.out.println("The line is vertical with equation: " + lineEquation);
            System.out.println("Slope is undefined (infinite).");
        }

        scanner.close();
    }
}