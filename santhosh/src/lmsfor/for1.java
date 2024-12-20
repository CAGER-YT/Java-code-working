package lmsfor;

//public class for1 {
//
//}
public class for1 {
	public static void main(String[]args){
    int num=28;
      for(int i=1;i<=num;i=i+1){
      	if((i%2==0)&&(i%3==0)){
      		continue;
        }else{
        	System.out.println(i);
        }
      }
    }
}