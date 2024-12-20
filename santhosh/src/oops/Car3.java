package oops;

public class Car3 {
	private String brand;
	private int price;
	private Battery3 b;
	
	public Car3(String brand,int price,Battery3 b) {
		this.brand=brand;
		this.price=price;
		this.b=b;
	}
//	public String getBrand(){
//		return brand;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//	public Battery3 getB() {
//		return b;
//	}
	
	public String toString() {
		return "Brand:"+brand+"\n"+"Price:"+price+"\n"+b;
	}
	
	

}
