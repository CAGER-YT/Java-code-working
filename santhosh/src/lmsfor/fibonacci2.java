package lmsfor;

public class fibonacci2 {
	public static void main(String[] args) {
		
//	int a=10,b=20;
//	int c=0,i;
	
//	for(i=0;i<8;i++) {
////		System.out.println(c);
//		c=a+b;
//		a=b;
//		b=c;
//	}
//	b=a-b;//swap number without third variable;
//	a=a-b;
//	System.out.print(a+":"+b);
//}
//}	


//public class fibonacci2 {
//	public static void main(String[]args){
    	int num=6;
      int c=0,a=0,b=1;
      for(int i=1;i<num;++i){
		c=a+b;
        a=b;
        b=c;
      }
      System.out.println("Addition of fibonacci series is "+c);
      
    }
}

