package collection;

import java.util.ArrayList;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>num=new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(50);
		num.add(60);
		num.add(0);
		num.add(90);
		num.add(200);
		num.add(130);
		num.add(105);
		num.add(1005);
		
//		int max=num.get(0);
//		for(Integer x:num) {			enhanced for max
//			if(x>max) {
//				max=x;
//			}
//		}
//		System.out.println(max);
//		for(Integer x:num) {
//			if(x%2==0) {
//				System.out.println(x+" Even");
//			}else {
//				System.out.println(x+" Odd");
//			}
//			
//			}
		ArrayList<String>name=new ArrayList<>();
		name.add("kumar");
		name.add("santhosh");
		name.add("manoj");
		name.add("rajesh");
		name.add("sathish");

//		name.forEach(x->System.out.println(x.charAt(x.length()-1)));
		String x="";
		for(String s:name) {
				x=x.concat(s);
		}
			System.out.println(x);
		
	}

}
