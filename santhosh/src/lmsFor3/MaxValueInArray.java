package lmsFor3;

public class MaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {24,105,950,80,70,33};{
			int temp=arr[0];
			int temp2=arr[0];
			for(int i=0;i<arr.length;i++) {
				
				
				if(arr[i]>temp) {//max (arr[i]>temp) //min(arr[i]<temp)
////					24>24 F
//					24>24 F\
					temp2=temp;
					temp=arr[i];
				}else  if(arr[i]>temp2) {
					temp2=arr[i];
				}
			}
			System.out.println(temp2);
		}

	}

}
//public class Done {
//	public static void main(String[]args){
//    String[] a=args[0].split(",");
//    int n1=Integer.parseInt(a[0]);
//    int n2=Integer.parseInt(a[1]);
//    int n3=Integer.parseInt(a[2]);
//    int n4=Integer.parseInt(a[3]);
//    int n5=Integer.parseInt(a[4]);
//    int [] num={n1,n2,n3,n4,n5};
//      int temp=num[0];
//      int mul=1;
//      for(int i=0;i<num.length;i++){
//      	if(num[i]>temp){
//        	temp=num[i];
//        } 
//      }
//      for(int j=1;j<=temp;j++){
//      	mul=mul*j;
//      }
//      System.out.println("factorial of heighest number is "+mul);
//    }
//}