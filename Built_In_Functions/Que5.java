import java.util.*;

public class Que5 {
    public static void main(String[] args) {
        String input = getInput();
        boolean isPalindrome = checkPalindrome(input);
        displayResult(isPalindrome);
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or phrase:");
        return sc.nextLine();
    }

    public static boolean checkPalindrome(String str) {
        String cleaned = str.replaceAll("\\s+|\\p{Punct}", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void displayResult(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}