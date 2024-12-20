package test;

import java.util.stream.IntStream;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "madam";
        
        boolean isPalindrome = isPalindrome(input);
        
        System.out.println("Is the string \"" + input + "\" a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase(); // Remove spaces and convert to lowercase

        return IntStream.range(0, normalized.length() / 2)
                .allMatch(i -> normalized.charAt(i) == normalized.charAt(normalized.length() - i - 1));
    }
}
