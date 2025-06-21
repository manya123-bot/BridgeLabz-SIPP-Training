package test;
import java.util.*;
public class Controlflow10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double x =0.0;
		int b = sc.nextInt();
		while(b!=0) {
			x+=b;
			
		}
		if(b==0) {
			System.out.print(x);	
		}
	
		
	}
}
