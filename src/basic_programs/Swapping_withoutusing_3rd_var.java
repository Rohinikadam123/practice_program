package basic_programs;

import java.util.Scanner;

public class Swapping_withoutusing_3rd_var {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("the numbers are=");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapping numbers are=");
		System.out.println(a);
		System.out.println(b);

	}
}
