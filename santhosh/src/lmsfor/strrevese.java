package lmsfor;

public class strrevese {
	public static void main(String[] args) {
		
	String s="madam";
	String temp="";
	for(int i=s.length()-1;i>=0;i--) {
		char val=s.charAt(i);
		temp=temp+val;
		
	}
//	System.out.print(temp);
	if(s.equalsIgnoreCase(temp)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("Not a palindrome");
	}

}
}