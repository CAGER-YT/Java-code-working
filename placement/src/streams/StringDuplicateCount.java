package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDuplicateCount {
	
	public static void main(String[] args) {
	      List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

	      Map<String, Long> nameCounts = names.stream()
	    		  .filter(x->Collections.frequency(names, x)>1)
	    		  .collect(Collectors.groupingBy(name -> name, Collectors.counting()));
	      System.out.println(nameCounts);
	}

}
