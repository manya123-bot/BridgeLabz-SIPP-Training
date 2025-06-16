package test;
import java.util.*;
public class Day2_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rad = sc.nextInt();
		double temp = ((4/3) * 3.14 )* (rad*rad*rad);
		System.out.print("The volume of earth in cubic kilometers is " +temp + " and cubic miles is " + (temp*1.6));
	}
}
