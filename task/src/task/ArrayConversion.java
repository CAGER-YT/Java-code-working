package task;

import java.util.ArrayList;
import java.util.List;

public class ArrayConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int num[]= {10,20,30,40,50,60};
		List<Integer> x=new ArrayList<>();
		for(Integer y:num) {
			x.add(y);
		}
//		x.add(num[0]);
//		x.add(num[1]);
//		x.add(num[2]);
//		x.add(num[3]);
//		x.add(num[4]);
//		x.add(num[5]);
		System.out.println(x);
		int [] newarr= new int[x.size()];
		for(int i=0;i<x.size();i++) {
			newarr[i]=x.get(i);
			System.out.print(newarr[i]+" ");
		}
	}

}
