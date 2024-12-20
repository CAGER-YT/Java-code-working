package Functions;

public class UseBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1=new Bike();
		b1.getbike("Hero", 250, 25000, 5000);
		b1.netprice(30000, 4000);
		Bike b2=new Bike();
		b2.getbike("TVS", 150, 15000, 4000);
		b2.netprice(15000, 4000);
		Bike b3=new Bike();
		b3.getbike("Bugati", 300, 450000, 3000);
		b3.netprice(450000, 3000);

	}

}
