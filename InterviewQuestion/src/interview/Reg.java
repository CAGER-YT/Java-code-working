package interview;

import java.util.regex.Pattern;

public class Reg {
	
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[abc]+", "abc"));
		//if the input is abc it will be false if i give a it will be true or 
		//if i give + it will be abc can check the whole string
		
		System.out.println(Pattern.matches("[^abc]", "z"));
		//^ this not check other value than in the bracket
		
		System.out.println(Pattern.matches("[^abc]+", "joela"));
		//^ this not check other value than in the bracket is present it will be false
		
		System.out.println(Pattern.matches("[\\w]", "A"));
		//check whether it has only character
		
		System.out.println(Pattern.matches("[\\w]", "Abaa1023"));
		//check whether it has more than one character

		System.out.println(Pattern.matches(".", "a"));
		//check whether any character is present are not
		
		System.out.println(Pattern.matches("[abc]*", "aabbcc"));
		
		System.out.println(Pattern.matches("[abc]*", ""));
		//any character
		System.out.println(Pattern.matches("[\\d]*", "-1"));
		//any number other than word
		System.out.println(Pattern.matches("onesoft[a-z]?", "onesoft"));
		//String match
		System.out.println(Pattern.matches("([A-Za-z]+)+(_[a-z]{4})+(_[0-9]{4})", "onesoft_best_1990"));
		//([A-Za-z]+) define string at front + next will be continued 
		//with _[a-z]{4} {4}- is to denote no of characters
		System.out.println("Email Checker: "+Pattern.matches("([\\w]+)+(-)(.[0-9])+(@[\\w]{4,5})+(.)([\\w]+)", "onesoft-.321@gmail.co"));
		System.out.println("Email Checker: "+Pattern.matches("([\\w-\\.]+)+(@[a-z]+)+(\\.[a-z]{2,3})", "sandykumar132000@gmail.com"));

		//		System.out.println(Pattern.matches("[\\W]", "!"));		
		
	}

}
