package basic_programs;

import java.util.Scanner;

public class Count_even_odd {

	public static void main(String[] args) {
		int Ecount=0,Ocount=0;
		for(int i=1;i<=150;i++) {
			if(i%2==0) {
				Ecount++;
			}else {
				Ocount++;
			}
		}
		System.out.println("even no count is:"+Ecount);
		System.out.println("Odd no count is:"+Ocount);
		}
}
