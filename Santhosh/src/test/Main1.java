package test;

import java.util.stream.Collectors;

public class Main1 {
 
public static void main(String[] args) {
 
String s = "capgemini1234!2";
//char[] a=s.toCharArray();
//for(char x:a) {
//	if(Character.isAlphabetic(x)) {
//		System.out.println("String"+x);
//	}else if(Character.isDigit(x)) {
//		System.out.println("Digit"+x);
//	}else {
//		System.out.println("Special"+x);
//	}
//}

String d=s.chars().filter(c->!Character.isLetter(c)).mapToObj(c-> String.valueOf((char) c)).collect(Collectors.joining());
System.out.println(d);
// 1. Extracting alphabets
 
String alphabets = s.chars()
 
.filter(Character::isLetter) // Filters only letters
 
.mapToObj(c -> String.valueOf((char) c))
 
.collect(Collectors.joining());
 
// 2. Extracting numbers
 
String numbers = s.chars()
 
.filter(Character::isDigit) // Filters only digits
 
.mapToObj(c -> String.valueOf((char) c))
 
.collect(Collectors.joining());
 
// 3. Extracting special characters
 
String specialChars = s.chars()
 
.filter(c -> !Character.isLetterOrDigit(c)) // Filters only non-letter, non-digit
 
.mapToObj(c -> String.valueOf((char) c))
 
.collect(Collectors.joining());
 
System.out.println("Alphabets: " + alphabets);
 
System.out.println("Numbers: " + numbers);
 
System.out.println("Special Characters: " + specialChars);
 
}
 
}

