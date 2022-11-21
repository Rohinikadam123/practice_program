package basic_programs;

import java.util.Scanner;

public class Using_if {

	public static void main(String[] args) {
		
	
	   Scanner scn = new Scanner(System.in);
	   System.out.println("enter a:");
	   int a= scn.nextInt();
	   System.out.println("enter b:");
	   int b= scn.nextInt();
		if(a==b) {
			System.out.println("square!!");
		} else {
			System.out.println("oops!");
		}
		scn.close();

	}

}
