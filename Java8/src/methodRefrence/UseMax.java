package methodRefrence;

public class UseMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,3,7,1,2,8,7,9,15,4};
//			FindMax fm=new FindMax();
//			Calculator c=fm::max;			//method reference
			Calculator c=FindMax::max;	//static method
			
			System.out.println(c.max(a));//method reference		
	}
}
interface Calculator{
	public int max(int[]a);
}