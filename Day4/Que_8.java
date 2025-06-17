import java.util.Scanner;

public class Que_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double voulme = (4 / 3) * 3.14 * radius * radius * radius;
        System.out.println(voulme);

    }
}
