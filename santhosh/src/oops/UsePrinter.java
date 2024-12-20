package oops;

//public class UsePrinter {
//
//}
public class UsePrinter {
	public static void main(String[] args){
  	String[] a=args[1].split(",");
    String[] b=args[0].split(",");
  	Cartridge c1=new Cartridge(a[0],Integer.parseInt(a[1]),a[2]);
    Printer p1=new Printer(b[0],Integer.parseInt(b[1]),Boolean.parseBoolean(b[2]),c1);
 	System.out.println(p1);
    }
}

class Printer {
	private String brand;
  	private int price;
  	private boolean isColorPrinter;
  	private Cartridge cartridge;
  public void setBrand(String b){
    brand=b;
  }
  public void setPrice(int p){
  	price=p;
  }
  public void setColorPrinter(boolean c){
  	isColorPrinter =c;
  }
  public void setC(Cartridge c1){
  	cartridge =c1;
  }
  public String getBrand(){
  	return brand;
  }
  public int getPrice(){
  	return price;
  }
  public boolean getColorPrinter(){
  	return isColorPrinter;
  }
  public Cartridge getC(){
  	return cartridge;
  }
  public Printer(String a,int p,boolean i,Cartridge c){
  	brand=a;
    price=p;
    isColorPrinter=i;
    cartridge=c;
  }
  public String toString(){
  	return "Brand: "+brand+", Price: "+price+", isColorPrinter: "+isColorPrinter+cartridge;
  }
}
class Cartridge{
	private String brand;
  	private int price;
  	private String color;
  
  public void setBrand(String b){
    brand=b;
  }
  public void setPrice(int p){
  	price=p;
  }
  public void setColor(String c){
  	color=c;
  }
  public String getBrand(){
  	return brand;
  }
  public int getPrice(){
  	return price;
  }
  public String getColor(){
  	return color;
  }
  public Cartridge(String b,int p,String c){
  	brand=b;
    price=p;
    color=c;
  }
  public String toString(){
  	return "Brand: "+brand+", Price: "+price+", Color: "+color;
  }
}