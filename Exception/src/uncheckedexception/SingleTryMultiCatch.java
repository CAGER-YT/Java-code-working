package uncheckedexception;

public class SingleTryMultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {null,"Sathish","Santhosh"};
		try {
		System.out.println(name[5]);
		System.out.println(name[2].charAt(10));
		System.out.println(name[0].toCharArray());
		}catch(NullPointerException ne) {
			System.out.println(ne);
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}catch(StringIndexOutOfBoundsException si) {
			System.out.println(si);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai);
		}catch(IndexOutOfBoundsException io) {
			System.out.println(io);
		}catch(RuntimeException re) {
			System.out.println(re);
			re.printStackTrace();
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Code Executed Succefully");
		}
	}

}
