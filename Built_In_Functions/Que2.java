import java.util.Scanner;

public class Que2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = takeInput(scanner);

        int max = findMaximum(numbers);

        System.out.println("The maximum of the three numbers is: " + max);

        scanner.close();
    }

    public static int[] takeInput(Scanner scanner) {
        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }
        return nums;
    }

    public static int findMaximum(int[] numbers) {
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}
