package test;
import java.util.*;
public class Day2_5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int pen = sc.nextInt();
		int student = sc.nextInt();
		int numberofpen = pen/student;
		int rem= pen%student;
		System.out.print("The Pen Per Student is "+ numberofpen +" and the remaining pen not distributed is "+ rem);
	}

}
