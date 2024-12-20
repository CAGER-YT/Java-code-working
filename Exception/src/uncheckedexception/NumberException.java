package uncheckedexception;

public class NumberException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="test";
		try{
		int b=Integer.parseInt(a);
		System.out.println(b);
		}catch(NumberFormatException e) {
			//System.out.println(e+ " Converting string to integer");
			e.printStackTrace();
		}
	}

}
