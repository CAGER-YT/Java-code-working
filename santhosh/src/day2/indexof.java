package day2;

public class indexof {
	public static void main(String []Args) {
		String x="helloworld";
//		int y=x.indexOf("h");
//		char z=x.charAt(1);
//		find last value of index length -1
//		char e= x.charAt(x.length()-1);
//		find in between value length /2
		char f= x.charAt(x.length()/2);
		System.out.println(f);
//		substring used return the word from index position
		String i=x.substring(5);
		System.out.println(i);
//		convert to char array format
		char[] o=x.toCharArray();
		System.out.println(o);
//		 p=x.split("o",4);
//		System.out.println(p);
	}
}
