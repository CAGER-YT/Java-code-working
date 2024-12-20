package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintOnlyDuplicateNumber {
	
	public static void main(String[] args) {
		
		List<Integer> x=Arrays.asList(10,20,10,30,20,40,50,10,40);
		Set<Integer> y=new HashSet();
		
		x.stream()
		.filter(z->!y.add(z)).forEach(n->{System.out.println(n);});
	}

}
