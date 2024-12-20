package lmsfor;

public class fibonacci {
	public static void main(String[] args) {
		
	int n=10,a=0;
	int b=1;
	
	for(int i=2;i<=10;i=i+7) {
		n=a+b;

		System.out.println(n);
		a=b;
		b=n;
	}
}
}	

