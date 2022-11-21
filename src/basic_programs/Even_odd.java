package basic_programs;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no=");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("even no");
		}else {
			System.out.println("odd no");
		}

	}

}
