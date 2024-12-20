package oops;

public class UseFarhenheit {
	public static void main(String[] args) {
		Farhen fb=new Farhen();
		System.out.println(fb.fahrernheit(25));
	}

}
class Farhen{
	public float fahrernheit(int cel) {
		float farh = (cel * 9/5) + 32;
		return farh;
	}

}