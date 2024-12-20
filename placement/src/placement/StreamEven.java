package placement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEven {

	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(2,3,4,5,6,7,8,9,10);
		
		s.stream().filter(x->x%2==0).forEach(y->System.out.println(y));
		
		int secondmax=s.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(secondmax);
	}
}
