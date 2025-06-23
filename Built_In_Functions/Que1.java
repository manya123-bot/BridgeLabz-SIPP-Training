import java.util.Random;
import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int low = 1, high = 100, guess;
        boolean guessed = false;

        System.out.println("Think of a number between 1 and 100.");

        while (!guessed && low <= high) {
            guess = new Random().nextInt(high - low + 1) + low;
            System.out.println("Is it " + guess + "?");
            String feedback = s.nextLine().toLowerCase();

            switch (feedback) {
                case "correct":
                    guessed = true;
                    break;
                case "higher":
                    low = guess + 1;
                    break;
                case "lower":
                    high = guess - 1;
                    break;
                default:
                    System.out.println("Please respond with higher, lower, or correct.");
            }
        }

        if (guessed)
            System.out.println("Guessed your number!");
        else
            System.out.println("Something's off, check your responses.");
        s.close();
    }
}