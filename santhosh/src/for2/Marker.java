package for2;

public class Marker {
	public static void main(String[] args) {
//		price
		int[]price= {0,20,30,40,50,60,70,80,90,100};
		int size=price.length/2;
		int count=0;
//		for(int i=0;i<=size;i++) {
//			count=count+1;
//			System.out.println(count+"Price:"+price[i]);//print value first half in front
//		}
//		for(int i=price.length-1;i>=size;i--) {
//			count=count+1;
//			System.out.println(count+"Price:"+price[i]);//print in reverse second half
//		}	
//		for(int i=size;i<price.length;i++) {
//			count++;
//			System.out.println(count+"Price:"+price[i]);//print in forward second half
//		}
		for(int i:price) {
			count=count+i;
		}
		System.out.println(count);

	}

}
