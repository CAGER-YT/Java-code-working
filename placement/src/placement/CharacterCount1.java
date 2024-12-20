package placement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCount1 {
	
	public static void main(String[] args) {
		String s="Onesoft";
		
//		List<String>x=new ArrayList<>();
//		for(int i=0;i<s.length();i++) {
//			x.add(""+s.toLowerCase().charAt(i));
//		}
		List<Integer>x=Arrays.asList(1,2,3,4,5,6,7);
        Map<Integer,Long> y = x.stream()
//                .sorted(Comparator.naturalOrder())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(y);
		
//		Map<String,Long>z=x.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
//		System.out.println(z);
		
//		Map<String,Long>z=x.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
//		
//		z.entrySet().stream().filter(a->a.getValue()==1).forEach(System.out::println);
		
//		Map<String,Long>z=x.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
//		z.entrySet().stream().filter(a->a.getValue()>1).forEach(System.out::println);
		
//		Map<String,Long>z=x.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
//		z.entrySet().stream().filter(a->a.getValue()==1).forEach(b->System.out.println(b.getKey()));
		
//		Map<String,Long>z=x.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
//		z.entrySet().stream().filter(a->a.getValue()>1).forEach(b->System.out.println(b.getKey()));
		
		List<Integer>a=Arrays.asList(1,2,3,4);
		List<Integer>b=Arrays.asList(6,2,3,5);

//		Stream<Integer>c=Stream.concat(a, b);
		
	}

}
