package oops;

public class UseCar4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a=args[0].split(",");
		
		Battery3 b1=new Battery3(Integer.parseInt(a[0]),Float.parseFloat(a[1]));

		Car3 c1=new Car3("Honda",10000,b1);
//		System.out.println(c1.getBrand()+"\n"+c1.getPrice()+"\n"+c1.getB().getCapacity());
		System.out.println(c1);
	}
}