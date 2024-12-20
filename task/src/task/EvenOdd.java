package task;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 6, 7, 4, 5, 9, 2);

        int evenTotal = nums.stream()
                            .filter(num -> num % 2 == 0) 
                            .mapToInt(Integer::intValue)
                            .sum(); // Sum the even numbers

        int oddTotal = nums.stream()
                           .filter(num -> num % 2 != 0) 
                           .mapToInt(Integer::intValue) 
                           .sum(); 
        System.out.println("Total of even numbers: " + evenTotal);
        System.out.println("Total of odd numbers: " + oddTotal);
    }
}
