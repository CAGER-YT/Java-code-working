package oops_3;

public class UseCar {

		// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		SportsCar1 s1=new SportsCar1();
//		System.out.println(s1.name("Audi"));
		System.out.println(s1.price(1000));
	}

}
abstract class Car1{
	public int price(int p) {
		return p;
	}
//	public abstract String name(String n);
}
class SportsCar1 extends Car1{
//	public String name(String n) {
//		return n;
//	}
}
