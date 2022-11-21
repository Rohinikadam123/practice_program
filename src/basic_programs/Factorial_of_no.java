package basic_programs;

import java.util.Scanner;

public class Factorial_of_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter no=");
		int n = sc.nextInt();
    // int n=6;
     int factorial=1;
     for(int i=1;i<=n;i++) {
    	 factorial=factorial*i;
     }
     
	System.out.println(factorial);
	}

}
