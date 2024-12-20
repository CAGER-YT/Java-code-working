package oops_2;

public class UseCar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Steering c1=new Steering();
		Brake b1=new Brake();
		Seat s1=new Seat();
		System.out.println(c1.isDisc(false,false));
		System.out.println(b1.isDisc(false));
		System.out.println(s1.isDisc(false,false,false));
	}
}//method overriding and hyerraichal
class CarParts{
	int price;
	String brand;
}
class Brake extends CarParts{
	boolean isDiscBrake;
	public String isDisc(boolean brake) {
		return "Disk Brake";
	}
}
class Steering extends CarParts{
	boolean isReplacable;
	public String isDisc(boolean brake,boolean isReplacable) {
		return "Disc Brake is Changable";
	}
}
class Seat extends CarParts{
	boolean isLeather;
	public String isDisc(boolean b,boolean isReplacable,boolean leather) {
		return "Disc Brake is Changable Leather easy to maintain";
	}
}