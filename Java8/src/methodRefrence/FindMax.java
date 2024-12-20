package methodRefrence;

public class FindMax {
	
	public static int max(int []a) {
		int max=a[0];
		for(Integer x:a) {
			if(x>max) {
				max=x;
			}
		}
		return max;
	}

}
