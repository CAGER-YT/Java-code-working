package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintallStringListWithCount {
	
	public static void main(String[] args) {
		
		List<String> x=Arrays.asList("AA","BB","AA","AC");
		
		Map<String,Long>y=x.stream()
				.collect(Collectors.groupingBy(z->z,Collectors.counting()));
		System.out.println(y);
	}

}
