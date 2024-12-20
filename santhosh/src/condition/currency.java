package condition;

//public class currency {
//	public static void main(String[] args) {
//		String a=args[0];
//		String b=args[1];
//		if (a.equals(b)) {
//			
//			System.out.println("Same");
//			
//		}else {
//			System.out.println("Different");
//		}
//	}
//}
//public class currency {
//	public static void main(String[] args){
//      String a=args[0];
//      String[] b=a.split(".");
//      float e=Float.parseFloat(a);
//      String c=args[1];
//      String[] d=a.split("."); 
//      float f=Float.parseFloat(c);
//
//      
//      if(b[0]==d[0]){
//      System.out.println("DECIMAL PARTS ARE EQUAL");
//      }else{
//      System.out.println("DECIMAL PARTS ARE NOT EQUAL");
//      }
//	}
//}
public class currency {
	public static void main(String[] args){
      String a="one#soft";
      
      if(a.indexOf(a.length()/2)=='#'){
      System.out.println("CONTAINS");
      }else{
      System.out.println("NOT CONTAINS");
      }
	}
}
