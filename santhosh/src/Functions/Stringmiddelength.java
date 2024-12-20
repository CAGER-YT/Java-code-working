package Functions;

public class Stringmiddelength {
	public static void main(String[] args) {
		String a="chennai";
		int length=a.length();
		int mid_length=a.length()/2;
		if(length%2!=0) {
			System.out.println(a.charAt(mid_length));
		}else{
			System.out.println((a.charAt(mid_length-1))+""+a.charAt(mid_length));
		}
	}

}
