package collection;

//public class UseComputer {
//
//}
import java.util.ArrayList;
public class UseComputer {
	public static void main(String[]args){
    String a[]=args[0].split(",");
    String b[]=args[1].split(",");
      Computer computer1=new Computer(a[0],Integer.parseInt(a[2]),a[1]);
      Computer computer2=new Computer(b[0],Integer.parseInt(b[2]),b[2]);
   		ArrayList<Computer>computers=new ArrayList<>();
      computers.add(computer1);
      computers.add(computer2);
      	for(Computer x:computers){
        	System.out.println(x.price+" is the Maximum Price");
        }
    }
}
class Computer{
	String brand;
  	int price;
	String color;
  public Computer(String b,int p,String c){
  	brand=b;
    price=p;
    color=c;
  }
  public void setBrand(String b){
  	brand=b;
  }
  public String getBrand(){
  	return brand;
  }
  public String toString(){
  	return "Brand="+brand;
  }
}