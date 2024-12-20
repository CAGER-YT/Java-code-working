package oops;

public class UseShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere s = new Sphere(5);
		System.out.println("Surface:"+s.calculateSurfaceArea()+", Volume:"+ s.calculateVolume());

	}

}
abstract class Shape {
	   public abstract double calculateVolume(); 
	   public abstract double calculateSurfaceArea();
}
class Sphere extends Shape{
    private double radius;

    public Sphere(double radius) {
        this.radius=radius;
    }
	@Override
	public double calculateVolume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}

	@Override
	public double calculateSurfaceArea() {
		return 4.0 * Math.PI * Math.pow(radius, 2);
	}
	
}