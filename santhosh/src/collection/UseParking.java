package collection;
import java.util.ArrayList;
public class UseParking {
	//parking capacity , name is parkingavailable,parking price per hr;
	//print only available;
	//parking price>100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parking p1=new Parking(150,true,"east",20);
		Parking p2=new Parking(200,true,"west",140);
		Parking p3=new Parking(50,false,"north",100);
		ArrayList<Parking>parkings=new ArrayList<>();
		parkings.add(p1);
		parkings.add(p2);
		parkings.add(p3);
		for(Parking x:parkings) {
			if(x.isParkingAvailable==true) {
				if(x.pricePerHr>100) {
					System.out.println(x);
				}
			}
		}
		
	}

}
class Parking{
	int capacity;
	boolean isParkingAvailable;
	String name;
	int pricePerHr;
	public Parking(int c,boolean is,String n,int p) {
		capacity=c;
		isParkingAvailable=is;
		name=n;
		pricePerHr=p;	
		
	}
	public String toString() {
		return "parking name:"+name+" "+capacity+" "+isParkingAvailable+" "+pricePerHr;
	}
}