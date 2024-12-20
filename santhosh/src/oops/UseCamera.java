package oops;

public class UseCamera {
	public static void main(String[] args) {
//		Lens l1=new Lens();
//		l1.isCleaningKit=true;							//1Composition
//		l1.zoom=4;
		
//		l1.setZoom(8);														//2getter & setter method
//		l1.setIsCleaningKit(false);
		
		Lens l1=new Lens(4,true);//constructor
		
//		Camera c1=new Camera();
//		c1.brand="Sony";
//		c1.price=25000;
//		c1.l=l1;
//		System.out.print("Brand"+c1.brand+"\n"+
//						"zoom:"+c1.l.zoom+"x\n"+		//1Composition
//				"Cleaning Kit:"+c1.l.isCleaningKit);
		
//		c1.setBrand("DSLR");
//		c1.setPrice(15000);
//		c1.setLens(l1);
//		
//		System.out.println("Brand:"+c1.getBrand()+"\n"+										//2getter & setter method
//						"zoom:"+c1.getLens().getZoom()+"x\n"+	
//				"Cleaning Kit:"+c1.getLens().getIsCleaningKit());
		
		Camera c1=new Camera("Nikon",30000,l1);
		Camera c2=new Camera("Nikon",20000,l1);
		Camera c3=new Camera("Nikon",4000,l1);//constructor
		Camera cameras[]= {c1,c2,c3};
//		System.out.println("Brand:"+c1.getBrand()+"\n"+										
//						"zoom:"+c1.getLens().getZoom()+"x\n"+	 		//CONSTRUCTOR WITH GETTER METHOD
//				"Cleaning Kit:"+c1.getLens().getIsCleaningKit());
		
		System.out.println(c1);
		c1.display(cameras);
		
	}
}
class Camera{
	private String brand;
	private int price;
	private Lens l;
//	public void setBrand(String b) {
//		brand=b;
//	}
//	public void setPrice(int p) {
//		price = p;													//2setter
//	}
//	public void setLens(Lens l1) {
//		l=l1;
//	}
	public Camera(String b,int price,Lens l) {
		brand=b;
		this.price=price;
		this.l=l;									//constructor
	}
	public String toString() {
		return "Brand:"+brand+"\n"+"Price:"+price+"\n"+l.toString();//CONSTRUCTOR WITHOUT GETTER METHOD
	}
//	public String getBrand() {
//		return brand;
//	}
//	public int getPrice() {							//CONSTRUCTOR WITH GETTER METHOD
//		return price;
//	}
//	public Lens getLens() {
//		return l;
//	}
	public void display(Camera [] cameras) {
		for(int i=0;i<cameras.length;i++) {
			System.out.println(cameras[i].price);
		}
	}
	
}

class Lens{
	private int zoom;
	private boolean isCleaningKit;
//	public void setZoom(int b) {
//		zoom=b;
//	}
//	public void setIsCleaningKit(boolean p) {				//2setter
//		isCleaningKit = p;
//	}
	public Lens(int z,boolean ck) {
		zoom=z;
		isCleaningKit=ck;							//constructor
	}
//	public int getZoom() {
//		return zoom;
//	}
//	public boolean getIsCleaningKit() {//CONSTRUCTOR WITH GETTER METHOD
//		return isCleaningKit;
//	}
	public String toString() {
		return "Zoom:"+zoom+"\n"+"ISCleaningKit:"+isCleaningKit;	//CONSTRUCTOR WITHOUT GETTER METHOD
	}
}
