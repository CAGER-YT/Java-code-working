package placement;

import java.util.Map;
import java.util.stream.Collectors;
public class StringCount {
public static void main(String[] args) {
	

	String a="helloh";
	Map<Character,Long> s=a.chars()
			.mapToObj(y->(char) y)
			.collect(Collectors.groupingBy(x->x, Collectors.counting()));
			s.forEach((b,c)->System.out.println(b+":"+c));
	System.out.println(s);
	
}
}
