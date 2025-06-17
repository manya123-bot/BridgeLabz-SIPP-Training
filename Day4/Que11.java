import java.util.Scanner;

public class Que11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();

        double yards = km * 3;
        double miles = km * 1760;

        System.out.println(yards);
        System.out.println(miles);
    }
}