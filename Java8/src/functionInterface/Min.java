package functionInterface;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {5,4,3,2,1,900,8,10,200};
		Minnum m=(x)->{
			int temp=x[0];
			for(int i=0;i<x.length;i++) {
				if(x[i]>temp) {
					temp=x[i];
				}
			}
			return temp;
		};
		System.out.println(m.max(nums));

	}

}
interface Minnum{
	public int max(int num[]);
}