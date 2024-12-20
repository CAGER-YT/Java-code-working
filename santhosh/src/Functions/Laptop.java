package Functions;

public class Laptop {
	String brand;
	int price;
	
	public void gettotal(Laptop[] laps) {
		int total=0;
		for(int i=0;i<laps.length;i++) {
			total=total+laps[i].price;
			System.out.println(total);
		}
	}
}
