package oops;

public class UseReverseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]d= {'a','b','c'};
		CharRev c=new CharRev();
		c.revcharArray(d);
	}

}
class CharRev{
	public void revcharArray(char[] c) {
		String temp="";
		for(int i=c.length-1;i>=0;i--) {
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j]) {
				temp = temp+c[i];
				}
			}
		}
		for(char x:temp.toCharArray()) {
			System.out.print(x+" ");
		}
		
	}
}