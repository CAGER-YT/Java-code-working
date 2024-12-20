package oops_3;

public class UseSportsCar {
	public static void main(String[] args) {
		Car s1=new SportsCar();
		System.out.println(s1.brand("Audi"));
		System.out.println(s1.price(908000));
		s1.color("pink");		
	}
}
interface Car{
	public String brand(String b);
	public int price(int p);
	public void color(String c);
}
class SportsCar implements Car{

public String brand(String b) {
	return b;
}
public int price(int p) {
	return p;
}
public void color(String c) {
	System.out.println(c);
}

}