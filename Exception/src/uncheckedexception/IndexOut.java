package uncheckedexception;

public class IndexOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="n";
		try {
		System.out.println(num.charAt(1));
		}catch(StringIndexOutOfBoundsException e){
			System.out.println(e);
			e.printStackTrace();
			
		}
	}

}
