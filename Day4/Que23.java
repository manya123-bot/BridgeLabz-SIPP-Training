import java.util.Scanner;

public class Que23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int combination = (n * (n - 1)) / 2;
        System.out.println(combination);

    }
}
