package customException;

public class UseAc {

	public static void main(String[] args)throws NoOfException {
		// TODO Auto-generated method stub
		Ac a1=new Ac("Diakin","m",15000,1);
		Ac a2=new Ac("CROMA","m",15000,5);
		Ac a3=new Ac("BluesStar","m",15000,3);
		Ac a4=new Ac("videcon","m",15000,-1);
		Ac a5=new Ac("nok","m",15000,1);
		
		Ac []acs= {a1,a2,a3,a4,a5};
		for(int i=0;i<acs.length;i++) {
			if(acs[i].getMonth()>0) {
				System.out.println("In Warranty");
			}else {
				throw new NoOfException("no Warranty");
			}
		}
	}

}
class Ac{
	String brand,model;
	int price,noOfMonthWarranty;
	public Ac(String b,String m,int p,int n) {
		brand=b;
		model=m;
		price=p;
		noOfMonthWarranty=n;
	}
	public int getMonth() {
		return noOfMonthWarranty;
	}
}

class NoOfException extends Exception{
	
	public NoOfException(String a) {
		System.out.println(a);
	}
}