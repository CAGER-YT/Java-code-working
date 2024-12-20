package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntMAx {
	
	public static void main(String[] args) {
		List<Integer> x=Arrays.asList(10,20,100,30,40,50);
		int max=x.stream().max(Comparable::compareTo).get();
		int secmax=x.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.max(Comparable::compareTo).get();
		System.out.println(secmax);
		System.out.println(System.nanoTime());
	}

}
