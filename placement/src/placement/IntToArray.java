package placement;

import java.util.Arrays;

public class IntToArray {
	
	public static int[] toArray(int n) {
		String num=String.valueOf(n);
		int []a=new int[num.length()];
		for(int i=0;i<num.length();i++) {
			a[i]=Character.getNumericValue(num.charAt(i));
		}
		return a;
	}
	public static void main(String[] args) {
		int num=5467;
		int [] a=toArray(num);
		System.out.println(Arrays.toString(a));
	}

}
