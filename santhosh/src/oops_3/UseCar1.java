package oops_3;

public class UseCar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 s1=new UseSportsCar1();
		System.out.println(s1.name("audi"+" "));
	}

}
interface Car2{
	public String name(String n);
	public int regno(int r);
	public boolean isPetrol(boolean p);
}
abstract class SportsCar2 implements Car2{
	public String name(String n) {
		return n.concat("bye");
	}
	public int regno(int r) {
		return r;
	}
	public boolean isPetrol(boolean p) {
		return p;
	}
	public abstract int price(int p);
}
class UseSportsCar1 extends SportsCar2{
	public int price(int c){
		return c;
	}
}

