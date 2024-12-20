package uncheckedexception;

public class AirthException {
//Arithmetic exception
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		int num1=10;
		int num2=0;
		try {
		int result =num1/num2;
		
		System.out.println(result);
		System.out.println("Thank you");
		}catch(ArithmeticException e){
			System.err.print(e+" error occured");
			
		}
	}

}
