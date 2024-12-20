package oops;

import java.util.Arrays;

public class UseAnagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram1 a=new Anagram1();
		System.out.println(a.findAnagramOrNot("listen", "silent"));
	}

}
class Anagram1{
	public boolean findAnagramOrNot(String a,String b) {
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