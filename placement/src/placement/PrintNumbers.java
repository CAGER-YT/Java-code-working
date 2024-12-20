package placement;

public class PrintNumbers {
	
	public static void generateNumber(int n) {
		if(n<=10) {
			System.out.println(n);
			generateNumber(n+1);
		}
	}

	public static void main(String[] args) {
		int s=1;
		generateNumber(s);
	}
}
