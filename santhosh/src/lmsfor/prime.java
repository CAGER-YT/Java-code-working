package lmsfor;

public class prime {
	public static void main(String[] args) {
//		int i,a=5;
//		boolean b=true;
//		for(i=2;i<a;i++) {
//			if (a%i==0) {
//				b=false;
////				System.out.println(" Is prime");
//				break;
//			}else {
//				b=true;
////				System.out.println(" Is not a prime");
////				break;
//			}
//			
//		}
//		if(b==true) {
//			System.out.println("prime");
//		}else {
//			System.out.print("Not prime");
//		}
//	}
//
//}
		
		int num=5,count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		
			if(count==0) {
				System.out.println(i+" prime");
			}else {
				System.out.println(i+" not a prime");
			}
		}

	}
	}
