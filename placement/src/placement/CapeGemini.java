package placement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapeGemini {
	public static void main(String[] args) {
//		String a="S@nthosh1234#123";
//		for(int i=0;i<a.length();i++) {
//			if(!Character.isLetterOrDigit(a.charAt(i))) {
//				System.out.println(a.charAt(i));
//			
//			}
//		}
//		int b[]= {1,2,4,5,50,6,7,8};
//		int c=Arrays.stream(b).max().getAsInt();
//		System.out.println(c);
		try {
			System.out.println("Hi");
			int b[]= {1,2,4,5,50,6,7,8};
			b[10]=200;
			int c=Arrays.stream(b).max().getAsInt();
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");
		
        String value = "abc1def2gh3ij4klm";
        String arr[]=value.split("\\d");
        List<String> x=new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
        	String p=arr[i];
        	if(p.length()==2) {
        		x.add(p.substring(0,2));
        	}
        }
        System.out.println(x);
        
        List<String> x1=Arrays.asList("10","20","30","santhosh");
//        x1.stream().filter(xy->xy.chars().anyMatch(Character::isDigit) && xy%2==0);
        
	}
}
