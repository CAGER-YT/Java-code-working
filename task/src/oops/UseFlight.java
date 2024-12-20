package oops;

public class UseFlight {
//	Implement a class "Flight" with private attributes for flight number, departure city, arrival city, and departure time.
//	Provide a constructor to initialize these attributes.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight f1=new Flight(1008,"Chennai","Singapore","18:05");
		System.out.println(f1);
		
	}

}
class Flight{
	int flightNumber;
	String departureCity;
	String arrivalCity;
	String departureTime;
	public Flight(int flightNumber, String departureCity, String arrivalCity, String departureTime) {
		super();
		this.flightNumber = flightNumber;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.departureTime = departureTime;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", departureCity=" + departureCity + ", arrivalCity="
				+ arrivalCity + ", departureTime=" + departureTime + "]";
	}
	
}