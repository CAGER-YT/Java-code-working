package placement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation {
	
	public static String swapString(String a, int i, int j) {
		char[] b = a.toCharArray();
		char temp = b[i];
		b[i] = b[j];
		b[j] = temp;
		return String.valueOf(b);
	}
	
	public static void main(String[] args) {
//		String a= "dog";
//		generateString(a, 0, a.length());
//	}
//	
//	public static void generateString(String a, int s, int e) {
//		if (s == e) {
//			System.out.println(a);
//		} else {
//			for (int i = s; i < e; i++) {
//				a = swapString(a, s, i);
//				generateString(a, s + 1, e);
//				a = swapString(a, s, i);
//				}
//			}
//		
        String b="Rameshwaram";
        char []c=b.toCharArray();
        
        List<Character> x=new ArrayList<>();
        
        for(Character y:c) {
        	x.add(y);
        }
        
     x.stream().collect(Collectors.groupingBy(z->z,Collectors.counting())).forEach((k,v)->System.out.println(k+"::"+v));;
//        x.stream().collect(Collectors.groupingBy(z->z,Collectors.counting())).forEach(System.out::println);;

//     System.out.println(y);
	}
	
//    public static void main(String[] args) {
//        // int arr[]={1,2,3,2,4,1,5,3,6,5};
//// result ={1,2,3,4,5,6}
//    //   var a= Arrays.stream(arr).distinct().sort().Collect(Collectors.toList());
//    //     System.out.println(Arrays.toString(a));
//        String b="Rameshwaram";
//        char []c=b.toCharArray();
//        
//        List<Character> x=new ArrayList<>(c);
//        
//        x.stream.collect(collectors.groupingBy(z->z,collectors.Counting())).forEach((k,v)->System.out.println(k+"::"+v));
//    }

}



