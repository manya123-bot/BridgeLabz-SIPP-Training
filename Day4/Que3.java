import java.util.*;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height_cm = sc.nextInt();
        double inch = height_cm / 2.54;
        int feet = (int) (inch / 12);
        double inches = inch % 12;
        System.out.println(feet + " " + inches);

    }
}
