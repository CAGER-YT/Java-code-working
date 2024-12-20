package interview;

import java.util.Arrays;


public class ArraMerge {
	
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {6, 2, 5, 3};
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[a.length + j] = b[j];
        }
        Arrays.sort(c);

        for(int e=0;e<c.length;e++) {
        	for(int f=e+1;f<c.length;f++) {
        	if(c[e]==c[f]) {
        		c[e]=0;
        		c[f]=0;
        	}
        	}
        	if(c[e]!=0) {
        		System.out.print(c[e]+" ");
        	}
        }
        
//        int []y=Arrays.stream(c).distinct().toArray();
//        for(Integer z:y) {
//        	System.out.print(z+" ");
//        }
    }
}
//
