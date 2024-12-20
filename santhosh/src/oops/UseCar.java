package oops;

public class UseCar {

	public static void main(String[] args) {
		Battery b1=new Battery();
		b1.capacity=12000;
		b1.voltage=120.10f;
		b1.isWarranty=true;
		
		Car c1=new Car();
		c1.brand="HONDA";
		c1.color="GOLD";
		c1.price=200000;
		c1.isPetrol=false;
		c1.b =b1;
		

		System.out.println("Battery:"+c1.b.capacity);
		
	}
}
class Car{
	String brand;
	String color;
	int price;
	boolean isPetrol;
	Battery b;
	
}
class Battery{
	int capacity;
	float voltage;
	boolean isWarranty;
	
}
