package basic_programs;

import java.util.Scanner;

public class Sum_of_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no:");
		int n =sc.nextInt();
		int a,i=0,j=0;
		a=n;
	while(a>0) {
		
			i=a%10;
			j=j+i;
			a=a/10;
			
		}
		System.out.println("sum of digit="+j);

	}
}
