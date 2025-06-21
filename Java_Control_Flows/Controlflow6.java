package test;
import java.util.*;
public class Controlflow6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=1) {
			System.out.println("positive");
		}
		else if(a==0) {
			System.out.println("zero");
		}
		else {
			System.out.println("negative");
		}
	}
}
