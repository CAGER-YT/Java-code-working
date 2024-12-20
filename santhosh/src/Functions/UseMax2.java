package Functions;

public class UseMax2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {10,20,3000,40,80,90,100,200};
		String names[]= {"Arjun","Gopal","Kumar","Santhosh","Manoj"};
		Max2 m1=new Max2();
		System.out.println(m1.getMax(nums));
		System.out.println(m1.getMax2(nums));
		System.out.println(m1.total(nums));
		System.out.println(m1.stringmaxlength(names));
		System.out.println(m1.maxvar());
		System.out.println(m1.middile("santhosh"));		
	}

}
