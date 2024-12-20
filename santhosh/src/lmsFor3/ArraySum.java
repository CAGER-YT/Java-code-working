package lmsFor3;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,7,1,2,6,10};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr.length;j++) {
				sum=arr[i]+arr[j];
				if(sum==8) {
					System.out.println(arr[i]+":"+arr[j]+"Index"+i +":"+j);
				}
			}
			
		}

	}

}
