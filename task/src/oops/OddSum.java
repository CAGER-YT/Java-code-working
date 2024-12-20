package oops;

public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {5,4,3,2,1,6,7,8,9,1};
		int sum=0;
		for(int i=0;i<num.length;i++) {
			if(i%2!=0) {
//				System.out.println(num[i]+" ");
				sum=sum+num[i];
			}
		}
		System.out.println(sum);
	}

}
