package oops;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringcheck s=new Stringcheck();
		System.out.println(s.concat("hello","World"));
	}
}

class Stringcheck{
	public String concat(String a,String b) {
		String c=a.toUpperCase()+b.toLowerCase();
		String temp="";
		for(int i=c.length()-1;i>=0;i--) {
			temp=temp+c.charAt(i);
		}
		return temp;
	}
}