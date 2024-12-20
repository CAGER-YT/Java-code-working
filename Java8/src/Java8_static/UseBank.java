package Java8_static;

public class UseBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ab=new AxisBank();
		System.out.println("AccountNumber"+ab.accNum(516451646465l)+"\n"+
		"Interset:"+ab.interest(15)+"\n"+
		"Blance:"+ab.balance(150000));
		System.out.println(Bank.branch("Adyar"));
		
	}

}
interface Bank{
	public long accNum(long a);
	public int interest(int b);
	public static String branch(String b) {
		return b;
	}
	public default String balance(int bal) {
		return "Bank bal is"+bal;
	}
}
class AxisBank implements Bank{
	public long accNum(long a) {
		return a;
	}
	public int interest(int b) {
		return b;
	}
	public String balance(int bal) {
		return "AxisBank bal is"+bal;
	}
}