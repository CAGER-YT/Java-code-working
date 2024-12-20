package oops;

public class Car2 {
	private String brand;
	private int price;
	private Battery2 b;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setPrice(int p) {
		price=p;
	}
	public int getPrice() {
		return price;
	}
	public void setB(Battery2 b1){
		b=b1;
	}
	public Battery2 getB() {
		return b;
	}
	
	

}
