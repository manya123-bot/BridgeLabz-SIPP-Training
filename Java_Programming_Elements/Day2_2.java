package test;
import java.util.*;
public class Day2_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int maths = sc.nextInt();
		int physics = sc.nextInt();
		int chemistry = sc.nextInt();
		System.out.print("Sam’s average mark in PCM is " + (maths+physics+chemistry)/3);
	}
}
