package Functions;

public class StringSplit {
	public static void main(String[] args) {
		String a="SALEM";
		int length=a.length();
		int mid_length=a.length()/2;
		if(length%2==0) {
			String b=a.substring(0,mid_length);
			String c=a.substring(mid_length,length);
			System.out.println(b+"-"+c);
		}else {
			String b=a.substring(0,mid_length);
			String c=a.substring(mid_length+0,length-3);
			String d=a.substring(mid_length+1,length);
			System.out.println(b+"-"+c+"-"+d);

		}
		


	}

}
//public class Done {
//	public static void main(String[]args){
//    	String a=args[0];
//      int length=a.length();
//      int mid_length=length/2;
//      if(length%2==0){
//      	String b=a.substring(0,mid_length);
//        String c=a.substring(mid_length,length);
//        System.out.println(b+"-"+c);
//      }else{
//        String c;
//        String b=a.substring(0,mid_length);
//        if(length<6){
//        c=a.substring(mid_length+0,length-2);
//        }else{
//        c=a.substring(mid_length+0,length-3);
//        }
//        String d=a.substring(mid_length+1,length);
//        System.out.println(b+"-"+c+"-"+d);
//      }
//    }
//}