package oops;

public class Stapler {
	private String brand;
	private int price;
	private String color;
	private String matereial;
	
	public void setBrand(String b) {
		brand=b;
	}
	public void setPrice(int p) {
		price=p;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setMaterila(String m) {
		matereial=m;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public String getMaterial() {
		return matereial;
	}
	
	
	public void display(Stapler [] staplers) {
		for(int i=0;i<staplers.length;i++) {
//			if(staplers[i].price>max) {
				System.out.println("Brand:"+staplers[i].brand+"\n"+
							   "Price:"+staplers[i].price+"\n"+
							   "Color:"+staplers[i].color+"\n"+
							   "Material:"+staplers[i].matereial+"\n");
//			}
			//return max;
		}
	}
	public int getMax(Stapler[] staplers) {
		int max=staplers[0].price;
		for(int i=0;i<staplers.length;i++) {
			if(staplers[i].price>max) {
				max=staplers[i].price;
			}
		}
		return max;
	}
	public void getPlastic(Stapler[] staplers) {
		for(int i=0;i<staplers.length;i++) {
			if(staplers[i].matereial.equals("plastic")) {
				System.out.println("Materila Plastic:"+staplers[i].matereial);
			}
		}
	}
	
	public String reverse(Stapler[] staplers) {
		String a="";
		for(int i=0;i<staplers.length;i++) {
			for(int j=staplers[i].brand.length()-1;j>=0;j--) {
				a=a+staplers[i].brand.charAt(j);
			}
		}
		return a+"\n";
		
	}	
}
