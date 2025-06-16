import java.util.*;

public class Que22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int faranheit = sc.nextInt();
        int celcius = (faranheit - 32) * 5 / 9;
        System.out.println(celcius);
    }
}
