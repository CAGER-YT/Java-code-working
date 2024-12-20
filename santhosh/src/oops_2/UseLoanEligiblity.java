package oops_2;

public class UseLoanEligiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryAssetsEligible s1=new SalaryAssetsEligible();
		System.out.println(s1.eligibleAmount(10000));
	}

}
//multilevel inheritence method overloading
//eligible amount;
//no work 30000 without parameter
//salary employee 50000 * 2+30000 
//property + salary *10

class Eligible{
	public int eligibleAmount() {
		return 30000;
	}
}
class SalaryEligible extends Eligible{
	public int eligibleAmount(int salary) {
		return (salary*2)+30000;
	}
}
class SalaryAssetsEligible extends SalaryEligible{
	public int eligibleAmount(int salary,int asset) {
		return (salary*2)+30000+(asset*10);
	}
}