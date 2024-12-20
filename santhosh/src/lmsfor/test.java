package lmsfor;

//public class test {
//
//}
//public class test {
//	public static void main(String[] args){
//    	int num=5;
//      int fact=1,i;
//      for(i=1;i<=num;i++){
//    	  fact=fact*i;
//      }
//      	if(num<0){
//        	System.out.println("INVALID NUMBER");
//        }else if(num>100){
//        	System.out.println("OUT OF RANGE");
//        }else{
//        	
//          System.out.println(fact);
//      }
//    }
//}
//public class test {
//  	public static void main(String[]args){
//	int[] a=[4 3 5 6 7 8 9 10];
//	int mul=1;
//  	for(int i=0;i<=a;i++){
//      if(i%2==0) {
//        mul=mul*i;
//      }
//    }
//
//  System.out.println(mul);
//}
//}
public class test {
  	public static void main(String[]args){
  	//int num=Integer.parseInt(args[0]);
  String a="ramr";
      int sum=0;
      char[] b=a.toCharArray();
  	for(int i=0;i%2==0;i++){
      char c = a.charAt(0);
		if(a.charAt(i)==c){
        	sum=sum+1;
        }
    }
  System.out.println(sum);
}
}
//Prime or Not: (using for loop)
//
//Read a string containing a number from args[0]
//
//Convert the string to int.
//
//Using for loop check if the number is prime or composite.
//
//If it has any factor, (divisor leaving reminder 0) other than 1 and itself then it is NOT PRIME. If there is no such divisor, then the number is PRIME
//
//If the number is less than 1 then prime or composite is not applicable, so in those cases print INVALID
//
//Sample Input: 7     Output: PRIME
//
//Sample Input: 0      Output: INVALID
//
//Sample Input: 24    Output: NOT PRIME
