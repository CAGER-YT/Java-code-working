package oops;

public class Ascii {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		FindAscii f=new FindAscii();
		f.Ascii('A');
	}

}
class FindAscii{
	public void Ascii(char c) {
		int x=(int)c;
//		int y=c;
		System.out.println(x);
	}
}