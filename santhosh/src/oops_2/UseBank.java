package oops_2;

public class UseBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankBaroda c1=new BankBaroda();
		System.out.println(c1.rateOfInterest(50000));
	}
//method overriding  or runtime  polymorphism
//	multilevel inheritence 
}
class Bank{
	public String rateOfInterest(int amt) {
		return "RateOfInterest:"+(amt*5/100);
	}
}
class CubBank extends Bank{
	public String rateOfInterest(int a) {
		return "CubRate:"+(a*10/100);
	}
}
class BankBaroda extends CubBank{
	public String rateOfInterest(int a) {
		return "BOBRate:"+(a*20/100);
	}
}