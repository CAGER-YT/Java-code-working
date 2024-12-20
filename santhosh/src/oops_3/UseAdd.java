package oops_3;

public class UseAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperAdd s1=new SuperAdd();
		System.out.println(s1.add("Hello", "World"));
	}

}

abstract class Add{
	public int add(int p) {
		return p;
	}
	public abstract int add(int a,int b);
}
class SuperAdd extends Add{
	public int add(int a,int b) {
		return a+b;
	}
	public String add(String a) {
		return a;
	}
	public String add(String a,String b) {
		return a+b;
	}
}