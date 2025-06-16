package test;
import java.util.*;
public class Day2_6 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int fee = sc.nextInt();
	int discountPercentage = sc.nextInt();
	int discount2 = (discountPercentage *fee)/100;
	System.out.print("The discount amount is INR " + discount2 +" and final discounted fee is INR " + (fee-discount2));
}
}
