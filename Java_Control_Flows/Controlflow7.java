package test;
import java.util.*;
public class Controlflow7 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	if((a==3 && b<=20) || (a==4 && b<=30) || (a==5 && b<=31) ||(a==6 && b<=20)) {
		System.out.print("Its a Spring Season");
	}
	else {
		System.out.print("Not a spring season");
	}
}
}
