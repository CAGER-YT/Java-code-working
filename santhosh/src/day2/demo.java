package day2;

public class demo {
	public static void main(String []Args) {
		String s="World soft wander";
		char [] v=s.toCharArray();
		String [] c=s.split(" ");
//		int i=0;
//		System.out.println(c[0].length());
//if (s.length()<10) {
//	System.out.println("1");
//}
//else if(s.contains("y"))
//	System.out.println("2");
//else
//{
//	for(int i=0;i<s.length();i++)
//	{
//		for(int j=0;s.contains("w");j++) {
//			System.out.print("4");
//	break;
//		}
//		break;
//	}
//	System.out.println("3");
//}

//if(s.length()>=10||s.length()==10) {
//	System.out.println("test");
//	for(i=0;i<s.length();i++) {
////		System.out.println("demo");
//
//	}
////	System.out.println("d2");
//
//}
//else {
//	System.out.println("new");
//
//
//}
System.out.print("Uppercase:"+s.toUpperCase()+"\n"
		+"length:"+s.length()+"\n"+
				"lowercase"+s.toLowerCase()+"\n"+
				"length:"+s.length()+"\n"+
				"contains:"+s.contains("soft")+"\n"+
				"endswith:"+s.endsWith("v")+"\n"+
				"index:"+s.indexOf("a")+"\n"+
				"char:"+s.charAt(4)+"\n"+
				"equals:"+s.equals("Army")+"\n"+
				"equalsignore:"+s.equalsIgnoreCase("world Soft Wander")+"\n"+
				"split:"+c[0]+c[1]+c[2]+"\n"+
				"String array to lower case:"+c[0].toLowerCase()+c[1].toLowerCase()+c[2].toLowerCase()+"\n"+
				"to char array:"+v[5]+"\n"+
				"Starts with w:"+s.startsWith("w")+"\n"+
				"ends with s:"+s.endsWith("s")+"\n"+
				"last second:"+s.charAt(s.length()-2)+"\n"+
				"concat:"+s.concat(" programms"));
	}

}
