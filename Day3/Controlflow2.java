package test;
import java.util.*;
public class Controlflow2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			flag = true;
		}
		System.out.print(" Is the first number the smallest? " + flag);
	}
}
