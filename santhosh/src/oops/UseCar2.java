package oops;

public class UseCar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battery2 b1=new Battery2();
		b1.setCapacity(10000);
		b1.setVoltage(120);
		Car2 c1=new Car2();
		c1.setBrand("HERO");
		c1.setPrice(120000);
		c1.setB(b1);
		System.out.println(c1.getBrand()+"\n"+c1.getPrice()+"\n"+c1.getB().getCapacity());
	}

}

