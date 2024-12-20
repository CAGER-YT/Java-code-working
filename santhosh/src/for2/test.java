package for2;

//public class test {
//	public static void main(String[] args) {
//		
//	
//	String a="MUKESH";
//	char[] c=a.toCharArray();
//	for(int i=0;i<c.length;i++) {
//		System.out.println(a.charAt(i));
//	}
//	}
//}
//public class test {
//	public static void main(String[]args){
//      String a=args[0];
//      String b[]=a.split(",");
//      String n1=b[0].toUpperCase();
//      String n2=b[1].toUpperCase();
//      String n3=b[2].toUpperCase();
//      String n4=b[3].toUpperCase();
//      String[] n={n1,n2,n3,n4};
//      for(int i=0;i<n.length;i++){
//          if(n[i].length()>6){
//      System.out.println(n[i]);
//    }
//      }
//    }
//}
public class test {
	public static void main(String[]args){
      String a=args[0];
      String[] b=a.split(",");
      int n1=Integer.parseInt(b[0]);
      int n2=Integer.parseInt(b[1]);
      int n3=Integer.parseInt(b[2]);
      int n4=Integer.parseInt(b[3]);
      int n5=Integer.parseInt(b[4]);
      int[]num={n1,n2,n3,n4,n5};
      int fact=1,fact1=0,count=0;;
      for(int i=0;i<num.length;i++){
        fact1=num[i];
        if(num[i]>=fact1){//2>2 f 6>2 t
      		for(int j=1;j<=num[i];j++){
      		count++;
        	fact=fact*num[i];
        	break;
        	}
        }else {
        	continue;
        }
      }if(count>0) {
      System.out.println(fact);
      }
    }
}