package oops_2;

public class UseMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//method overloading
		Max m=new Max();
		System.out.println(m.max(5,10));
	}
}
//method overloading
class Max{
	public int max(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	public String max(String a,String b) {
		if(a.length()>b.length()) {
			return a;
		}else {
			return b;
		}
	}
}
