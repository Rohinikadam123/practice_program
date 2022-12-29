package basic_programs;

import java.util.Scanner;

public class Reverse_of_no {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the no:");
//		int n=sc.nextInt();
		int a=9876,b=0;
//		a=n;
		while(a>0) {
		int c=a%10;
			
			b=(b*10)+c;
			a=a/10;
			
		}
		System.out.println("the reverse no. is:"+b);
	}


//	int number = 987654, reverse = 0;  
//	while(number > 0)   
//	{  
//	int remainder = number % 10;  
//	reverse = reverse * 10 + remainder;  
//	number = number/10;  
//	}  
//	System.out.println("The reverse of the given number is: " + reverse);  
//	}  
}
