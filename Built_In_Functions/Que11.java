import java.time.LocalDate;
import java.util.Scanner;

public class Que11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        LocalDate newDate = date.plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        newDate = newDate.minusWeeks(3);
        System.out.println("Original date: " + date);
        System.out.println("After adding 7 days, 1 month, and 2 years, then subtracting 3 weeks: " + newDate);

        scanner.close();
    }
}