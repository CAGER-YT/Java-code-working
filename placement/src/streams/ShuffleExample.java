package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleExample {
    public static void main(String[] args) {
        List<Integer> e = new ArrayList<>();
        e.add(1);
        e.add(2);
        e.add(3);
        e.add(4);
        e.add(5);

        // Shuffle the list
        Collections.shuffle(e);

        // Print the shuffled list
        System.out.println(e);
    }
}
