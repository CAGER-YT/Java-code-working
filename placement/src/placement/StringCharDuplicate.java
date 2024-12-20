package placement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringCharDuplicate {
	
	public static void main(String[] args) {
//		String a[]= {"apple","banana"};
//		
//		Arrays.stream(a).flatMap(b->b.chars().mapToObj(b->(char)b).collect(Collectors.groupingBy(b->b,Collectors.counting), null, null));
		
		List<Map.Entry<String,Integer>> x=new ArrayList();
		
		x.add(Map.entry("10-09-2024", 100));
		x.add(Map.entry("12-09-2024", 70));
		x.add(Map.entry("10-09-2024", 100));
		x.add(Map.entry("7-09-2024", 120));
		x.add(Map.entry("10-09-2024", 10));
		
		var c=x.stream().collect(Collectors.groupingBy(Map.Entry::getKey,Collectors.summingInt(Map.Entry::getValue)));
		
//		Map<String,Integer> result=new HashMap<>();
//		var c=x.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getKey,Collectors.summingInt(Map.Entry::getValue)));
//		for(Map.Entry<String, Integer> entry:x.entrySet()) {
//			result.merge(entry.getKey(), entry.getValue(), Integer::sum);
//		}

//		System.out.println(c);
		
		int[] a = {7,3,4,3,5,4,1,7};
//		print 7,3,4 (duplicate) without streams
		for(int i=0;i<a.length;i++) {
			int count=0;
			if(a[i]!=0) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=0;
				}
			}
			if(count>0) {
				System.out.println(a[i]+" :: "+count);
			}
			}

		}
		
	}

}
