 package oops_2;

public class UseStationary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pencil p=new Pencil();
		p.brand="Natraj";
		p.isWood=true;
		p.price=30;
		p.qty=5;
		System.out.println("Brand:"+p.brand+"\n"+"Price:"+p.price+"\n"+"Quality:"+p.quality());

	}

}

class Stationary{
	String brand;
	int price;
}
class Pencil extends Stationary{
	boolean isWood;
	int qty;
	public String quality() {
		if(price>50) {
			return "Good";
		}else {
			return "Average";
		}
	}
}
