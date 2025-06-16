package test;
import java.util.*;
public class Controlflow1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int n = sc.nextInt();
		if(n%5==0) {
			flag = true;
		}
		System.out.print("Is the number "+ n +" divisible by 5? "+ flag);
	}
}
