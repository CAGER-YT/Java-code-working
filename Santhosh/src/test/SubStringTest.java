package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SubStringTest {
	
	public static void main(String[] args) {
		
//		Find the length of the longest substring without repeating characters.
//		springbootjpaabccabcdefgabcspring
		
		
//		String a="springbootjpaabccabcdefgabcspring";
//		char[] c=
//		Set<Character> b=new HashSet<>();
//		String temp="";
//		System.out.println(a.charAt(a.length()-1));
//		for(int i=0;i<a.length();i++) {
//			for(int j=a.length()-1;j>=0;j--) {
//				if(a.charAt(i)!=a.charAt(j)) {
//					temp=a.substring(i,j-1);
//					
//				}
//				
//			}
//		}
		
//		3) Print first 3 odd number and last 4 even number
//	7,8,5,4,2,3,6,9,8,5,4,2,3
		
		List<Integer>x=Arrays.asList(7,8,5,4,2,3,6,9,8,5,4,2,3);
		
		List<Integer>y=x.stream().filter(a->a%2!=0).distinct().limit(3).collect(Collectors.toList());
		System.out.println(y);
		
		List<Integer>z=x.stream().distinct().sorted(Comparator.reverseOrder()).filter(a->a%2==0).limit(4).toList();
		
		System.out.println(z);
		
		
	}

}
