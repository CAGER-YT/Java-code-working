package day2;

public class usecar {
	public static void main(String [] Args) {
		car c1= new car();
		c1.Brand="Audi";
		c1.price=2;
		c1.color="Black";
		
		car c2= new car();
		c2.Brand="Benz";
		c2.price=2;
		c2.color="Blue";
		
		car c3= new car();
		c3.Brand="BMW";
		c3.price=2;
		c3.color="Black";
		
		System.out.println("String in upper case"
		+c1.Brand.toUpperCase()+"\n"
		+c1.color.toUpperCase()+"\n"
		+c2.Brand.toUpperCase()+"\n"
		+c2.color.toUpperCase()+"\n"
		+c3.Brand.toUpperCase()+"\n"
		+c3.color.toUpperCase()+"\n"
		+c1.Brand.endsWith("y")+"\n"
		+c1.Brand.charAt(c1.Brand.length()/2)+"\n"
		+c2.color.equals("Blue")+"\n"
		+"add:"+(c1.price+c2.price+c3.price));
	}
}
