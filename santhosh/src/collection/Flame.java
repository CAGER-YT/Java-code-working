package collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flame {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		String input1 = s.next();
//		String input2 = s.next(); 
//		char[] con1=input1.toLowerCase().toCharArray();
//		char[] con2=input2.toLowerCase().toCharArray();
//		for(int i=0;i<input1.length();i++) {
//			for(int j=0;j<input2.length();j++) {
//				if(con1[i]==con2[j]) {
//					con2[j]='$';
//				}
//			}
//			if(con2[i]!='$') {
//				System.out.println(con2[i]+"❤️");
//			}
//			
//		}
		List<String> x=Arrays.asList("santhosh","kumar","kumar","joel");
		x.stream()
		.collect(Collectors.groupingBy(y->y,Collectors.counting()))
		.entrySet().stream().filter(y->y.getValue()>1)
		.forEach(a->System.out.println(a.getValue()));
//		System.out.println(b);
	}
	
}
