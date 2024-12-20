package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Summingint {

	
	public static void main(String[] args) {
		
		List<Integer>x=Arrays.asList(1,2,3,4,5,6,7,8,9);

		int sum=x.stream().collect(Collectors.summingInt(n->n));
		System.out.println(sum);
	}
}
