import java.util.Scanner;

public class PlaindromeChecker {
    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--))
                return false;
        }
        return true;
    }

    public static void displayResult(String str, boolean isPalin) {
        if (isPalin)
            System.out.println("\"" + str + "\" is a palindrome.");
        else
            System.out.println("\"" + str + "\" is not a palindrome.");
    }
}
