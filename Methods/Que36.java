import java.util.Arrays;
import java.util.Scanner;

public class Que36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factors: " + Arrays.toString(findFactors(num)));
        System.out.println("Is Armstrong? " + isArmstrongNumber(num));

        sc.close();
    }

    static int[] findFactors(int n) {
        int[] factors = new int[n];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return Arrays.copyOf(factors, index);
    }

    static boolean isArmstrongNumber(int n) {
        int sum = 0, temp = n;
        int len = String.valueOf(n).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, len);
            temp /= 10;
        }
        return sum == n;
    }
}