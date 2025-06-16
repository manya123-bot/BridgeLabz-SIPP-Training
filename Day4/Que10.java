import java.util.*;

public class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discount = sc.nextInt();
        int discountedAmount = fee * discount / 100;
        double discountedPrice = fee - discountedAmount;
        System.out.println(discountedAmount);
        System.out.println(discountedPrice);

    }
}
