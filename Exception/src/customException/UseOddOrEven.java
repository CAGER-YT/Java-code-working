package customException;

public class UseOddOrEven {

	public static void main(String[] args)throws OddException{
		// TODO Auto-generated method stub
		String a="Hello";
		if(a.length()%2==0) {
			System.out.println("Even");
		}else {
			throw new OddException("Odd");
		}
	}

}
class OddException extends Exception{
	public OddException(String a) {
		super(a);
	}
}