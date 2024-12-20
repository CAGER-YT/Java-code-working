package streams;

import java.util.Arrays;
import java.util.List;

public class IntMin {
	
	public static void main(String[] args) {
		
		List<Integer>x=Arrays.asList(10,20,30,15,6,7,50,2);
		int min =x.stream().min(Comparable::compareTo).get();
		System.out.println(min);
		
		int secmin=x.stream()
				.sorted().skip(1)
				.min(Comparable::compareTo)
				.get();
		System.out.println(secmin);
	}

}
