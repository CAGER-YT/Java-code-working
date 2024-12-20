package for2;

public class Fruit {
	String name;
	int price;
	public static void main(String[] args) {
		Fruit a=new Fruit();
		a.name="apple";
		a.price=10;
		Fruit b=new Fruit();
		b.name="banana";
		b.price=20;
		Fruit c=new Fruit();
		c.name="orange";
		c.price=30;
		String MaxString="";
		int MaxLength=0;
		Fruit[] v= {a,b,c};
		for(Fruit fresh:v) {//syntax for each  for(data type : array name)
//			System.out.println(fresh.price);
			if(fresh.name.length()>MaxLength) {
				MaxString=fresh.name;
				MaxLength=fresh.name.length();
				
			System.out.println(MaxString);
			}
			
		}
	}
}
