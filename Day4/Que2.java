import java.util.*;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discount = sc.nextInt();
        int total = fee * discount / 100;
        double finalPrice = fee - total;

        System.out.println(finalPrice);

    }

}