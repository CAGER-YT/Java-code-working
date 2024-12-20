package test;

public class MainClass {
	public static void incNum(int n,int i) {
		if(i<=n) {
			System.out.println(i);
			int x=i+1;
			incNum(n, x);
			
		}
	}
	public static void main(String[] args) {
		incNum(20, 5);
	}

}
