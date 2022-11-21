package basic_programs;

public class Fibonacci_series {

	public static void main(String[] args) {
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=20;i++) {
			int c=a+b;
			if(c<=100)    //print value up to 100
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
