package test;
import java.util.*;
public class Day2_4 {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int cost = sc.nextInt();
int sell = sc.nextInt();
double percent = ((sell-cost)/cost)*100;
System.out.print("The Cost Price is INR " + cost +" and Selling Price is INR " + sell +"/n"+  +"The Profit is INR " + (sell-cost) + " and the Profit Percentage is " + percent);
}}
