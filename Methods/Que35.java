import java.util.Random;
import java.util.Scanner;

public class Que35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int otp = generateOTP();
        System.out.println("Generated OTP: " + otp);
        sc.close();
    }

    public static int generateOTP() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000);
    }
}