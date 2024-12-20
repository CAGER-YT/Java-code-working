package oops_2;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Single Inheritence

		SportsCar s1=new SportsCar();
		s1.brand="Ferrari";
		s1.style="Light Weight";
		s1.cc=2000;
		s1.speed=100;
		s1.price=400000;
		System.out.println(s1.netprice(10));
		System.out.println(s1.brand+"\n"+s1.price+"\n"+s1.cc+"\n"+s1.speed+"\n"+s1.style);

	}

}

class Car{
	String brand;
	int price;
	public int netprice(int discount) {
		return  price-(price*discount/100);
	}
}

class SportsCar extends Car{
	String style;
	int cc;
	int speed;
}
