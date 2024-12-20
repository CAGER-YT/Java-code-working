package placement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class charactercount {

	public static void main(String[] args) {
//		Test1 t=()->{
//			System.out.println("Test");
//		};
//		t.getMethod();
		
		Test1 t=()->{
			return "Test String Return";
		};
		System.out.println(t.getString());
		String a="onesoft";
		char[]b=a.toCharArray();
		
//		Arrays.stre
		//normal for 1st program
//		for(int i=0;i<a.length();i++) {
//			int count=1;
//			for (int j=i+1;j<a.length();j++) {
//				if(b[i]==b[j]) {
//					b[i]='$';
//					b[j]='$';
//					count++;
//				}
//			}
//			if(b[i]!='$' || count >1)
//			System.out.println(a.charAt(i)+" "+count);
//		}
		// normal for 2nd program
//		for(int i=0;i<a.length();i++) {
//			int count=1;
//			for (int j=i+1;j<a.length();j++) {
//				if(b[i]==b[j]) {
//					b[i]='$';
//					b[j]='$';
//					count++;
//				}
//			}
//			if(b[i]!='$' || count >1)
//			System.out.println(a.charAt(i)+" "+count);
//		}
		
		// 1st program streams 
//		List<String>x=new ArrayList<>(a.length());
//		for(int i=0;i<a.length();i++) {
//			x.add(""+b[i]);
//		}
//		System.out.println(x);
//		Map<String,Long>y=x.stream().collect(Collectors.groupingBy(z->z,Collectors.counting()));
//		System.out.println(y);
//		y.entrySet().stream().filter(d->d.getValue()==1).forEach(c->System.out.println(c));

// 2nd program in stream		
//		List<String>x=new ArrayList<>(a.length());
//		for(int i=0;i<a.length();i++) {
//			x.add(""+b[i]);
//		}
//		System.out.println(x);
//		Map<String,Long>y=x.stream().collect(Collectors.groupingBy(z->z,Collectors.counting()));
//		System.out.println(y);
//		
//		y.entrySet().stream().filter(d->d.getValue()==1).forEach(c->System.out.println(c));

//		// 3rd program streams 
//		List<String>x=new ArrayList<>(a.length());
//		for(int i=0;i<a.length();i++) {
//			x.add(""+b[i]);
//		}
//		System.out.println(x);
//		Map<String,Long>y=x.stream().collect(Collectors.groupingBy(z->z,Collectors.counting()));
//		System.out.println(y);
//		y.entrySet().stream().filter(d->d.getValue()==1).forEach(c->System.out.println(c));
		
		// 4th program streams 
//		List<String>x=new ArrayList<>(a.length());
//		for(int i=0;i<a.length();i++) {
//			x.add(""+b[i]);
//		}
//		Map<String,Long>y=x.stream().collect(Collectors.groupingBy(z->z,Collectors.counting()));
//		System.out.println(y);
//		y.entrySet().stream().filter(d->d.getValue()==1).forEach(c->System.out.println(c.getKey()));
		
		
//		5th program
		List<String>x=new ArrayList<>(a.length());
		for(int i=0;i<a.length();i++) {
			x.add(""+b[i]);
		}
		Map<String,Long>y=x.stream().collect(Collectors.groupingBy(z->z,Collectors.counting()));
//		System.out.println(y);
		y.entrySet().stream().filter(d->d.getValue()>1).forEach(System.out::println);
		
		List<String> a1= Arrays.asList("10","20","30","santhosh");
		int sum = a1.stream()
				   .filter(b1->b1.chars().anyMatch(Character::isDigit))
		           .map(b1 -> Integer.parseInt(b1))  // Convert String to Integer
		           .reduce(0, (total, element) -> total + element);  // Sum all elements
		
		System.out.println(sum);
	}
}
