package test;
import java.util.*;
public class Day2_10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double inches = a*0.3937;
		double feet = inches *0.0833;
		System.out.print("Your Height in cm is "+ a + " while in feet is " + feet +" and inches is " + inches 
);
	}
}
