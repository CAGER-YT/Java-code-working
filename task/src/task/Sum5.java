package task;

import java.util.Arrays;
import java.util.List;

public class Sum5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        
        
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == 5) {
                   System.out.println(numbers.get(i)+" "+numbers.get(j));
                }
            }
        } 
    }
}


