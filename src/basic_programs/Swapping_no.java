package basic_programs;

import java.util.Scanner;

public class Swapping_no {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("the numbers are");
		 a=sc.nextInt();
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("swapping numbers are"+a);
//		System.out.println(a);
//		System.out.println(b);
		
}}