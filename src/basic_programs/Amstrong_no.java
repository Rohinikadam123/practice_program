package basic_programs;

import java.util.Scanner;

public class Amstrong_no {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the no:");
//		int n=sc.nextInt();
		for(int n=1;n<=1000;n++) {
			int a,i,j=0;
			a=n;
			while(a>0) {
				i=a%10;
				j=(i*i*i)+j;
				a=a/10;
				}
			
			if(n==j) {
			System.out.println(n);
		}
		}}}