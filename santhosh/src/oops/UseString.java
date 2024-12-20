package oops;

public class UseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"hi","hello","byr","newoorld"};
		String1 s1=new String1();
		s1.getChar(a);
		
	}

}
class String1{
	public void getChar(String[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].charAt(i));
		}
	}
}