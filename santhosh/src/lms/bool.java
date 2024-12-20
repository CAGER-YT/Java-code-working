package lms;

public class bool {
	public static void main(String[] args){
      String s=args[0];
     // String x=args[1];
      int a=Integer.parseInt(s);
      int b=5;
      boolean c=a % b==0;
//      boolean x=Boolean.parseBoolean(a%b);
      if(a % 5==0) {
          System.out.println(c);
      }
      }
}