package condition;

public class stringlength {
	public static void main(String[] args) {
		String a="tiger";
		if (a.length()%2==0) {
			System.out.println("Is even:"+a.charAt(a.length()-1));
		}
		else {
			System.out.println("Is odd:"+a.charAt(a.length()/2));
		}
	}
}
// odd middle character
// even last character