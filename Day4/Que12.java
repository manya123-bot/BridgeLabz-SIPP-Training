import java.util.*;

public class Que12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base_cm = sc.nextDouble();
        double height_cm = sc.nextDouble();
        double area = 0.5 * base_cm * height_cm;

        double baseInch = base_cm / 2.54;
        double heightInch = height_cm / 2.54;

        double area1 = 0.5 * baseInch * heightInch;

        System.out.println(area);
        System.out.println(area1);
    }

}
