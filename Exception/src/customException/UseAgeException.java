package customException;

public class UseAgeException {

	public static void main(String[] args)throws  AgeException{
		// TODO Auto-generated method stub
		int age=17;
		if(age>=18) {
			System.out.println("Elgibile");
		}else {
			throw new AgeException("Not Eligible");
		}
	}

}
class AgeException extends Exception{
	public AgeException(String a) {
		super(a);
	}
}