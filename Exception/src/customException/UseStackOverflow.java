package customException;

public class UseStackOverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOverFlow se=new StackOverFlow();
		System.out.println(se.msg());

	}

}
class StackOverFlow extends Exception{
	public String msg() {
		System.out.println("hellov");
		return msg();
	}
}
