package oops;

public class UseCar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battery3 b1=new Battery3(200,120.0f);

		Car3 c1=new Car3("Honda",10000,b1);
//		System.out.println(c1.getBrand()+"\n"+c1.getPrice()+"\n"+c1.getB().getCapacity());
		System.out.println(c1);
	}

}

