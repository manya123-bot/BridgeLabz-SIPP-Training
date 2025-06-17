import java.util.*;;

public class Que20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfChoco = sc.nextInt();
        int noOfChildren = sc.nextInt();

        int distribued = noOfChoco / noOfChildren;
        int remaining = noOfChoco % noOfChildren;
        System.out.print(distribued);
        System.out.print(remaining);
    }
}
