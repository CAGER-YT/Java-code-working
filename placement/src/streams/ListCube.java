package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListCube {

	public static void main(String[] args) {
		List<Integer>x=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		x.stream().map(n->n*n*n)
		.filter(n->n>50)
		.forEach(y->System.out.println(y));
		
	}
}
