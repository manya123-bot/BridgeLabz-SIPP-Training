import java.util.*;

public class Que_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Maths = sc.nextDouble();
        double Physics = sc.nextDouble();
        double Chemistry = sc.nextDouble();
        double total = (Maths + Physics + Chemistry) / 3;
        System.out.println(total);
    }
}
