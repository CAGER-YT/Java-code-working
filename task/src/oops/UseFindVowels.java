package oops;

public class UseFindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowels v=new Vowels();
		System.out.println(v.FindVowels("Hello, World!"));
	}

}
class Vowels{
	public String FindVowels(String word) {
		char[] c=word.toLowerCase().toCharArray();
		String temp="";
		for(int i=0;i<word.length();i++) {
			int count=0;
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
				count++;
				c[i]='$';
			}
			if(c[i]!='$') {
				temp=temp+c[i];
			}
		}
		return temp;
		
	}
}