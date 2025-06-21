import java.util.Scanner;

public class Que32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of values to check: ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("\nEnter number " + (i + 1) + ": ");
            int n = sc.nextInt();

            System.out.println("Number: " + n);
            System.out.println("Perfect? " + isPerfect(n));
            System.out.println("Abundant? " + isAbundant(n));
            System.out.println("Deficient? " + isDeficient(n));
            System.out.println("Strong? " + isStrong(n));
        }
        sc.close();
    }

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0)
                sum += i;
        return sum == n;
    }

    static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0)
                sum += i;
        return sum > n;
    }

    static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0)
                sum += i;
        return sum < n;
    }

    static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == n;
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++)
            f *= i;
        return f;
    }
}