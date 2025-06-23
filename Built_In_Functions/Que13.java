import java.time.LocalDate;
import java.util.Scanner;

public class Que13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = "yyyy-MM-dd";

        LocalDate d1 = LocalDate.parse(sc.nextLine(), java.time.format.DateTimeFormatter.ofPattern(pattern));
        LocalDate d2 = LocalDate.parse(sc.nextLine(), java.time.format.DateTimeFormatter.ofPattern(pattern));

        if (d1.isBefore(d2))
            System.out.println("Before");
        else if (d1.isAfter(d2))
            System.out.println("After");
        else
            System.out.println("Same");
        sc.close();
    }
}