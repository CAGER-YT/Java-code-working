package lmsFor3;

public class StringLastCharacter {
	public static void main(String[] args) {
		String [] str= {"one","two","three","four","seven"};
		int count=0;
		for(int i=0;i<str.length;i++) {
			
			System.out.println(str[i].charAt(count));
			count=count+1;
		}
	}
}