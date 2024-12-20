package oops;

public class UseCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.calculateVolume(5.0, 10.0));
	}

}
class Cylinder {
    public double calculateVolume(double radius, double height) {
        double volume=Math.PI*radius*radius*height;
        return volume;
    }
}
