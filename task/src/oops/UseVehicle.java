package oops;

public class UseVehicle {
//	Design a class "Vehicle" with attributes such as make and model. Derive a class "Bike" from "Vehicle" and then 
//	derive a class "MountainBike" from "Bike" with additional attributes like suspension type.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb=new MountainBike();
		mb.make="steel";
		mb.model="XV500";
		mb.suspensiontype="Rigid axle front suspension";
		System.out.println("Make:"+mb.make+" "+"Model:"+mb.model+" "+"Suspension:"+mb.suspensiontype);
	}

}
class Vehicle{
	String make;
	String model;
}
class Bike extends Vehicle{
	
}
class MountainBike extends Bike{
	String suspensiontype;
}