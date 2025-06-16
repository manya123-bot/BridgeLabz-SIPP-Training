import java.util.*;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = sc.nextInt();
        int student = sc.nextInt();
        int distributed = pens / student;
        int remaining = pens % student;

        System.out.println(distributed + " " + remaining);

    }
}
