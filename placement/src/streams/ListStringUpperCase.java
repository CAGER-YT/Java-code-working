package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListStringUpperCase {
	
	public static void main(String[] args) {
		
		List<String>x=Arrays.asList("joel","kumar","rajesh","sriram","naveen","santhosh");
		
		List<String> y=x.stream().map(z->z.toUpperCase())
				.sorted(Comparator.reverseOrder())
				.toList();
		System.out.println(y);
	}

}
