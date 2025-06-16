import java.util.Scanner;

public class Que19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celcius = sc.nextInt();
        double farenheit = (celcius * 9 / 5) + 32;
        System.out.println(farenheit);
    }
}
