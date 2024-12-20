package lmsFor3;

public class Pyramind {

	public static void main(String[] args) {
		int num=6;int j;
//		for(int i =0;i<num;i++) {
//			for(j=num-i;j>1;j--) {
//				System.out.print(" "); 
//				}
//			for(int k=0;k<=i;k++) {
//				System.out.print(num-i-1+" ");//i+
//			}
//			System.out.println();
//		}
		for(int i =num;i>0;i--) {
			for(j=num-1;j>=1;j--) {
				System.out.print(" "); 
				}
			for(int k=0;k<=i;k++) {
				System.out.print(num-i+" ");//i+
			}
			System.out.println();
		}
		

	}

}

//		* 
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * * 
// * * * * * * 