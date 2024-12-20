package condition;

public class leapyear {
	public static void main(String[] args) {
//		int year=2004;
		String a="a";
		
		int[]y= {2001,2002,2004,2010,2008,2012};
		for(int i:y) {
		if(i%4==0) {
			System.out.println("Leap year:"+i);
			
			
		}
		else
		{
			System.out.println("Not a Leap Year:"+i);
		}
	}
	}

}
