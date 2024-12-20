package Functions;

public class Bike {
	String name;
	int speed;
	int price;
	int tax;
	public void getbike(String name,int speed,int price,int tax){
		System.out.println("Bike Name:"+name+"\n"+
				"Speed:"+speed+"\n"+
				"price:"+price+"\n"+
				"tax:"+tax);
	}
		public void netprice(int price ,int tax) {
		System.out.print("Net Price:"+(price+tax)+"\n");
	}

}
