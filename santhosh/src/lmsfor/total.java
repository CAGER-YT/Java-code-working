package lmsfor;

public class total {
	public static void main(String[] args) {
		int total=0,count=0;
		for(int i=0;i<1000;i++) {
			total=total+i;
			count=count+1;
		}
		System.out.println(total/count);
	}

}
