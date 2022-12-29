package basic_programs;

public class Palindrome1_100 {

	public static void main(String[] args) {
		for(int n=1;n<=100;n++) {
			int a,b,c=0;
		 a=n;
		 while(a>0) {
			 b=a%10;
			 c=(c*10+b);
			 a=a/10;
			  }
			if(n==c) {
				System.out.println(n);
			}
			
		}
}}