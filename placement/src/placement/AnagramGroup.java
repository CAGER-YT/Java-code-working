package placement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroup {

    public static void main(String[] args) {
        // Define an array of strings containing the input words
        String[] w = {"cat", "act", "dog", "god","ogd","fan","naf","taf","fat","tac","tac"};

        // Create a HashMap to store the grouped anagrams
        // The key is a sorted version of the string, and the value is a list of strings that are anagrams
        Map<String, List<String>> a = new HashMap<>();

        // Iterate over each string in the input array
        for (String s : w) {
            // Convert the string to a character array
            char[] chars = s.toCharArray();
            
            // Sort the character array
            Arrays.sort(chars);
            
            // Convert the sorted character array back to a string
            String sw = new String(chars);
            
            // Use computeIfAbsent to add the sorted string as a key in the map if it doesn't exist
            // Then add the original string to the list of anagrams for that key
//            a.computeIfAbsent(sw, k -> new ArrayList<>()).add(s);
            if(!a.containsKey(sw)) {
                a.put(sw, new ArrayList<>());
            }
            
            // Add the original string to the list associated with the sorted string key
            a.get(sw).add(s);
            
        }

        // Iterate over the values of the map (which are lists of anagrams) and print each list
        
        System.out.println(a);
//        for (List<String> b : a.values()) {
//            System.out.println(b);
//        }
    }
}
