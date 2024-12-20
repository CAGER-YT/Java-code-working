package oops_2;

public class UseBike1 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub //Single inheritence with protected
		HillBike m1=new HillBike("Honda",20000,200,14.5f);	
		System.out.println(m1);
	}
}
class Bike{
	private String brand;
	private int price;
	public Bike(String b,int p) {
		brand=b;
		price=p;
	}
	public Bike(Bike b) {
		this(b.brand,b.price);
	}
	public String toString() {
		return brand+" "+price;
	}
}
class MountainBike extends Bike{
	private int cc;
	private float weight;
	public MountainBike(String b,int p,int cc,float weight) {
		super(b,p);
		this.cc=cc;
		this.weight=weight;
	}
	public String toString() {
		return super.toString()+" "+cc+" "+weight;
	}
}
class HillBike extends MountainBike{
	public HillBike(String b,int p,int cc,float weight) {
		super(b,p,cc,weight);
	}
	public String toString() {
		return super.toString();
	}
}