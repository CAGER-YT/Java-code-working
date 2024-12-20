package placement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streams.FindFirst;

public class IntArray {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {6,2,3,5};
//		int c[]=new int[a.length+b.length];
//		for(int i=0;i<a.length;i++) {
//			c[i]=a[i];
//		}
//		for(int j=0;j<a.length;j++) {
//			c[j+a.length]=b[j];
//		}
		Integer []c=Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed()).toArray(Integer[]::new);

        Map<Integer, Long> frequencyMap = Arrays.stream(c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int[] uniqueArray = Arrays.stream(c)
        		.filter(e -> frequencyMap.get(e) == 1)
        		.mapToInt(Integer::intValue)
        		.toArray();
        System.out.println(Arrays.toString(uniqueArray));
        
        System.out.println(Arrays.stream(a).boxed().sorted((e,d)->d-e).skip(1).findFirst().get());
	}

}
