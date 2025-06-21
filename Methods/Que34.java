import java.util.Scanner;

public class Que34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Number: " + num);
        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Largest digit: " + getLargestDigit(num));
        System.out.println("Smallest digit: " + getSmallestDigit(num));
        System.out.println("Sum of digits: " + sumDigits(num));
        System.out.println("Is prime? " + isPrime(num));
        System.out.println("Is Armstrong? " + isArmstrong(num));

        sc.close();
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int getLargestDigit(int num) {
        int max = 0;
        while (num > 0) {
            int d = num % 10;
            if (d > max)
                max = d;
            num /= 10;
        }
        return max;
    }

    public static int getSmallestDigit(int num) {
        int min = 9;
        while (num > 0) {
            int d = num % 10;
            if (d < min)
                min = d;
            num /= 10;
        }
        return min;
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num;
        int len = String.valueOf(num).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, len);
            temp /= 10;
        }
        return sum == num;
    }
}