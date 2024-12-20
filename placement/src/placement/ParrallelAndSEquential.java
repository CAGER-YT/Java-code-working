package placement;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParrallelAndSEquential {

	
	public static void main(String[] args) {
		
//		var n=("San");
		
		int[]a=new int[10];
		Integer[]c=new Integer[10];
		Arrays.fill(c, 10);
//		Arrays.fill(a, 2);
		System.out.println(Arrays.toString(a));
		long sT=System.currentTimeMillis();
		int sum=Arrays.stream(a).parallel().map(b->b*b).sum();
		long eT=System.currentTimeMillis();
		
		Arrays.stream(a).forEach(v->System.out.println(v));
		Stream.of(a).forEach(v->System.out.println(v));
		System.out.println(sum);
		System.out.println("Time Taken:"+(eT-sT));
	}
}
