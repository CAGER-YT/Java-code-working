package lmsFor3;

public class test {
    public static void main(String[] args){
        // Split the input string into an array of words
        String[] words = args[0].split(",");

        // Initialize an array to store the reversed words
        String[] reversedWords = new String[words.length];

        // Iterate over the words
        for (int i = 0; i < words.length; i++) {
            // Reverse the current word
            String reversedWord = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWord += words[i].charAt(j);
            }

            // Store the reversed word
            reversedWords[i] = reversedWord;
        }

        // Reverse the order of the words
        for (int i = 0; i < words.length / 2; i++) {
            String temp = reversedWords[i];
            reversedWords[i] = reversedWords[words.length - 1 - i];
            reversedWords[words.length - 1 - i] = temp;
        }

        // Join the reversed words into a string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < reversedWords.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(reversedWords[i]);
        }

        // Print the final string
        System.out.println(sb.toString());
    }
}