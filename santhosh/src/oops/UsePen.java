package oops;

public class UsePen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pen p1=new Pen();
			p1.setBrand("Cello");
			System.out.println(p1.getBrand());
	}

}

class Pen{
	String brand;
	int price;
	int life;
	
	public void setBrand(String b) {
		brand=b;
	}
	public String getBrand() {
		return brand;
	}
	
}
