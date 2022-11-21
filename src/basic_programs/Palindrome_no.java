package basic_programs;

import java.util.Scanner;

public class Palindrome_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no=");
		int n=sc.nextInt();
		int a,b,c=0;
		a=n;
		while(a>0) {
			b=a%10;
			c=(c*10)+b;
			a=a/10;
			}
      if(n==c) {
    	  System.out.println("it's a palindrome!");
      }else {
    	  System.out.println("it's not a palindrome!");
      }
	}}