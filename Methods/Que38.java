import java.util.Arrays;
import java.util.Scanner;

public class Que38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("Number: " + num);
        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Digits array: " + Arrays.toString(getDigits(num)));
        System.out.println("Reversed digits array: " + Arrays.toString(reverseDigits(num)));
        System.out.println("Comparison (original vs reversed): " + compareArrays(getDigits(num), reverseDigits(num)));
        System.out.println("Sum of squares of digits: " + sumOfSquares(getDigits(num)));
        System.out.println("Sum of cubes of digits: " + sumOfCubes(getDigits(num)));
        System.out.println("Frequency of digit 1: " + getFrequency(num, 1));
    }

    public static int countDigits(int num) {
        if (num == 0)
            return 1;
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] getDigits(int num) {
        int len = countDigits(num);
        int[] digits = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int[] reverseDigits(int num) {
        int[] digits = getDigits(num);
        for (int i = 0, j = digits.length - 1; i < j; i++, j--) {
            int temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;
        }
        return digits;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num * num;
        }
        return sum;
    }

    public static int sumOfCubes(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num * num * num;
        }
        return sum;
    }

    public static int getFrequency(int num, int digit) {
        int count = 0;
        if (num == 0 && digit == 0)
            return 1;
        while (num > 0) {
            if (num % 10 == digit)
                count++;
            num /= 10;
        }
        return count;
    }
}