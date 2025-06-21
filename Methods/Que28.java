import java.util.Scanner;

public class Que28 {

    // 1. Check if number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // 2. Check if number is neon
    public static boolean isNeon(int n) {
        int square = n * n;
        int sumDigits = 0;
        while (square > 0) {
            sumDigits += square % 10;
            square /= 10;
        }
        return sumDigits == n;
    }

    // 3. Check if number is spy
    public static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // 4. Check if number is automorphic
    public static boolean isAutomorphic(int n) {
        int square = n * n;
        String squareStr = String.valueOf(square);
        String nStr = String.valueOf(n);
        return squareStr.endsWith(nStr);
    }

    // 5. Check if number is Buzz
    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }

    // Method for checking if a number is a spy number (called in main)
    public static boolean spyNo(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int n = scanner.nextInt();

        System.out.println("Number: " + n);
        System.out.println("Prime? " + isPrime(n));
        System.out.println("Neon? " + isNeon(n));
        System.out.println("Spy? " + isSpy(n));
        System.out.println("Automorphic? " + isAutomorphic(n));
        System.out.println("Buzz? " + isBuzz(n));
        // Call the spyNo method explicitly
        System.out.println("Spy number (using spyNo method)? " + spyNo(n));

        scanner.close();
    }
}