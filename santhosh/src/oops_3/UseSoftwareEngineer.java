package oops_3;

public class UseSoftwareEngineer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftwareEngineer s1=new SoftwareEngineer();
		System.out.println("WORKS:"+s1.workForLiving("IT")+"\n"+
							"SALARY:"+s1.salary(50000)+"\n"+
							"EATS:"+s1.eat("Burger")+"\n"+
							"SLEEP:"+s1.sleep(6)+"\n"+
							"WALKS:"+s1.walk(3)
						);
		
	}

}
interface Human{
	public String eat(String e);
	public int sleep(int hr);
	public int walk(int hr);
}
abstract class Engineer implements Human{
	public String workForLiving(String work) {
		return work;
	}
	public String eat(String e) {
		return e;
	}
	public int sleep(int hr) {
		return hr;
	}
	public int walk(int hr) {
		return hr;
	}
	public abstract int salary(int salary);
}
class SoftwareEngineer extends Engineer{
	public int salary(int s) {
		return s;
	}
}