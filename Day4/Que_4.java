import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costPrice = sc.nextInt();
        int sellingPrice = sc.nextInt();
        int Profit = sellingPrice - costPrice;
        int Profit_Percentage = Profit * 100 / costPrice;
        System.out.println(Profit);
        System.out.println(Profit_Percentage);
    }
}
