package placement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VarCheck {

	public static void main(String[] args) {
//		var a=10;
//		System.out.println(a);
//		int [] a= {8,1,2,4,6,7};
//		Arrays.sort(a);
//		int max=a[a.length-1];
//		List<Integer> b=Arrays.stream(a).boxed().collect(Collectors.toList());
//		for(int i=0;i<max;i++){
//			if(!b.contains(i)) {
//			System.out.println(i);
//			}
//		}
//		Integer sum= b.stream().reduce(0,(x,y)->x+y);
//		System.out.println(sum);
		
//		List<Integer>x=Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer>x=Arrays.asList(10,9,1,2,1,2,3,4,5,6,7,8,0);

//		int sum=x.stream().filter(a->a%2==0).map(a->a*2).reduce(0,(a,b)->a+b);
//		System.out.println(sum)

//		x.stream().sorted(Comparator.reverseOrder()).distinct().forEach(a->System.out.println(a));
		
		Stream.iterate(1, a->a+2).limit(10).forEach(a->System.out.println(a));
		String a="apple";
		String b="apple";
		if(a==b) {
			System.out.println(true);
		}
		int secmin=x.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secmin);
	}
}
