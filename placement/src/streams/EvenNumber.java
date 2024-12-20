package streams;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {
		List<Integer> x=Arrays.asList(1,2,3,4,5,6,7);
		x.stream().filter(n->n%2==0).forEach(y->{System.out.println(y);});
	}
}
