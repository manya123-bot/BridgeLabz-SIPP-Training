package test;
import java.util.*;
public class Controlflow3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean flag1=false;
		boolean flag2=false;
		boolean flag3=false;
		if(a>b && a>c) {
			flag1= true;
		}
		else if(b>a && b>c) {
			flag2= true;
		}
		else {
			flag3=true;
		}
		System.out.println("Is the first number the largest? " + flag1);
		System.out.println("Is the second number the largest? " + flag2);
		System.out.println("Is the third number the largest? " + flag3);
		
	}
}
