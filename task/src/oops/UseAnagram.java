package oops;

import java.util.Arrays;

public class UseAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram a=new Anagram();
		System.out.println(a.findAnagramOrNot("listen"));
	}

}
class Anagram{
	public boolean findAnagramOrNot(String a) {
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(a.length()!=b.length()) {
			return false;
		}else {				
			
			char[] c=a.toCharArray();
			char[] d=b.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			return Arrays.equals(c, d);
		}
		
	}
	
}