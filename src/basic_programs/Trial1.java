package basic_programs;



public class Trial1 {

	public static void main(String[] args) {
for(int i=1;i<=100;i++) {
	int a=i,b,c=0;
	while(a>0) {
		b=a%10;
		c=(b*10)+b;
		a=a/10;
		
	}
	if(i==c) {
		System.out.println(i);
	}
}
	}
	}


