package basic_programs;

import java.util.Scanner;

public class Count_of_no {

	public static void main(String[] args) {
		int a,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no:");
		
		a=sc.nextInt();
		while(a>0) {
			a=a/10;
			b++;
			}
		System.out.println("no. of digit present:"+b);

	}

}
