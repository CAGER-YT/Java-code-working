package streams;

import java.util.Arrays;
import java.util.List;

public class FindFirst {

	public static void main(String[] args) {
		List<Integer> x=Arrays.asList(1,2,3,4,5,6,7,8);
		
		System.out.println(x.stream().findFirst().get());
	}
}
