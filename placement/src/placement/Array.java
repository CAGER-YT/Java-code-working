package placement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Array {

	public static void main(String[] args) {
		
		Integer arr2[]= {1,2,4,5};
		Arrays.sort(arr2);
		List<Integer> in2=Arrays.asList(arr2);
		IntStream.range(1, 6).forEach(i->{if(!in2.contains(i)) {System.out.println(i);}});
		
			int	target= 9;
			Map<Integer, Integer>y=new HashMap<Integer, Integer>();
			for(int i=0;i<arr2.length;i++) {
				int c=target-arr2[i];
				if(y.containsKey(c)) {
					System.out.println(y.get(c)+"::"+i);
				}
//				System.out.println(c);
				y.put(arr2[i], i);
			}
//				Output : [0,3]
			
			String input1 = "coodeboarddtechnoologgy";
			char cha1[]=input1.toCharArray();
			List<Character>x1=new ArrayList<>();
	        for (char i : cha1) {
	            x1.add(i);  // Autoboxing from char to Character
	        }
	       var y1= x1.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
	       System.out.println(y1);
	       
	       String input2 = "ABCDEDCBA";
	       for(int t=0;t<input2.length();t++) {
	    	   System.out.println(input2.substring(0,input2.length()-t));
	       }
	       
	       String input3="Portable Network Graphics";
	       String []arr24=input3.split(" ");
	       String tem="";
	       for(int i=0;i<arr24.length;i++) {
	    	   tem=tem+arr24[i].charAt(0);
	       }
	       System.out.println(tem);
	       
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(arr));

		
      Integer a1[]= {10,20,30,40};
      Collections.swap(Arrays.asList(a1), a1.length-2, a1.length-1);
      System.out.println(Arrays.toString(a1));
      
        List<Integer> input = Arrays.asList(23, 243, 23, 86, 1, 34, 455, 98, 456, 2, 1, 345, 345, 677, 3453, 677, 243);
        int a[]= {10,20,30,40};


       var x= IntStream.range(0, input.size()-1).boxed().collect(Collectors.partitioningBy(i->i%2==0,Collectors.mapping(i->input.get(i), Collectors.toList())));
	System.out.println(x);
	}
}
