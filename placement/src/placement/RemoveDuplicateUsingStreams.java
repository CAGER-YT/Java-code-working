package placement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateUsingStreams {
	
	public static void main(String[] args) {
		
        List<Integer> n = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 10);
        n.stream().distinct()
        .collect(Collectors.toList())
        .forEach(x->System.out.println(x));;
	}

}
