package placement;

public class IntReverse {
	
	public static void reverse(int n) {
		String a=String.valueOf(n);
		String temp="";
		for(int i=a.length()-1;i>=0;i--) {
			temp=temp+a.charAt(i);
		}
		System.out.println(temp);
	}
	public static void main(String[] args) {
		int n=543;
		reverse(n);
	}

}
