package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streams {

	public static void main(String[] args) {
		List<Integer> x=new ArrayList<>();
		x.add(1);x.add(2);x.add(3);x.add(4);x.add(1);x.add(2);x.add(2);x.add(5);x.add(6);
		x.stream().distinct().forEach(c->System.out.println(c));
		Stream.iterate(0, i->i+1).limit(10).forEach(d->System.out.println(d));// iterate and print variable
		
		List<String> y=Arrays.asList("Joel","Santhosh","Shriram","pethchinathan","Kumar");
		
	}
}
