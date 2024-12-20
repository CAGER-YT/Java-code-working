package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCount {
	
	public static void main(String[] args) {
		String s="Onesoft";
				
		List<String>x=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			x.add(""+s.charAt(i));
		}
		
		Map<String,Long>z=x.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
		System.out.println(z);
	}

}
