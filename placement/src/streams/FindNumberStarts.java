package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNumberStarts {
	
	public static void main(String[] args) {
		
		List<Integer>x=Arrays.asList(10,20,30,14,15,16,70);
		
		List<Integer>c=new ArrayList<Integer>(x);
		System.out.println(c);
		
		x.stream().map(a->a+"")
		.filter(y->y.startsWith("1"))
		.forEach(z->{System.out.println(z);});
	}

}
