package oops;

public class UseLeapYear {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear l=new LeapYear();
		System.out.println(l.findleapyear(2004));
	}

}
class LeapYear{
	public String findleapyear(int year) {
		if(year%4==0) {
			return "Leap year";
		}else {
			return "Not Leap year";
		}
	}
}