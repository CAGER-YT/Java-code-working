package oops_2;

public class UseFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coil c1=new Coil();
		c1.brand="Havels";
		c1.price=1200;
		c1.capacity=120;
		c1.noOfWings=3;
		c1.powerSource="AC";
		c1.voltage="15.5V";
		
		System.out.println(c1.brand+" "+c1.price);
	}
//multi level inheritence
}
class Electronic{
	String voltage;
}
class Fan extends Electronic{
	String brand;
	int price;
	int noOfWings;
}
class Coil extends Fan{
	int capacity;
	String powerSource;
}
