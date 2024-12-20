package oops;

public class Battery3 {
	private int capacity;
	private float voltage;

	public Battery3(int capacity,float voltage) {
		this.capacity=capacity;
		this.voltage=voltage;
	}
//	public int getCapacity() {
//		return capacity;
//	}
//	public float getVoltage() {
//		return voltage;
//	}
	public String toString() {
		return "capacity:"+capacity+"\n"+"Voltage"+voltage;
	}
}
