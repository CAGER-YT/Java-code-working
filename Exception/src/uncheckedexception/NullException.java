package uncheckedexception;

public class NullException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		System.out.println(name);
		try {
		char b=name.charAt(0);
		System.out.println(b);
		}catch(NullPointerException e) {
			System.out.println(e+ "Stringf cannot be empty");
		}
	}

}
