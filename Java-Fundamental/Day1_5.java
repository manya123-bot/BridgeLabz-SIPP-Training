import java.util.Scanner;

public class Day1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();
        double height = sc.nextDouble();
        double volume = radius * radius * Math.PI * height;
        System.out.println(volume);
    }
}
