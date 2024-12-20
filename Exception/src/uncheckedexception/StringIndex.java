package uncheckedexception;

public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {5,4,3,2};
		try {
		System.out.println(num[4]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			e.printStackTrace();
			
		}
	}

}
