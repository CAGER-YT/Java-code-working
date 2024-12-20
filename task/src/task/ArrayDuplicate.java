
package task;

import java.util.*;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] nums = {2, 5, 2, 6, 8, 3, 5, 2, 5, 9};
        int []y=Arrays.stream(nums).distinct().toArray();
        for(Integer z:y) {
        	System.out.print(z+" ");
        }
    }
}
