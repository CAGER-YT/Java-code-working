package oops;

public class UseResizable {
	public static void main(String[] args) {
		
	
	Rectangle r1=new Rectangle(50, 40);
	System.out.println(r1.getWidth()+" "+r1.getHeight());
	r1.resizeHeight(30);
	r1.resizeWidth(43);
	System.out.println(r1.getWidth()+" "+r1.getHeight());

	}
}
//Implement an interface "Resizable" with methods "resizeWidth" and "resizeHeight" to change the dimensions of a shape.

interface Resizable{
	public void resizeWidth(double newWidth);
	public void resizeHeight(double newHeight);
}
class Rectangle implements Resizable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void resizeWidth(double newWidth) {
        this.width = newWidth;
    }

    @Override
    public void resizeHeight(double newHeight) {
        this.height = newHeight;
    }
}