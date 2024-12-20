package day2;

public class stringboolean {
	public static void main(String[]Args)
	{
		String x="hello";
		boolean y=x.equals("Hello");
//		string equals
		boolean z=x.equalsIgnoreCase("Hello");
//		String ignore case
		String a="State";
		boolean b=a.startsWith("St");
		boolean c=a.endsWith("te");
//		starts and ends with
		String n="python";
		boolean m=n.contains("pyt");
		System.out.println("Equals:"+y+"\n"+"equals ignorecase:"+z+"\n"+"startswith:"+b+"\n"+"endswith:"+c+"\n"+"Concat:"+m);
		
	}
}
