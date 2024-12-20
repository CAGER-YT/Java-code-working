package Functions;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand="Lenovo";
		l1.price=20000;
		Laptop l2=new Laptop();
		l2.brand="Dell";
		l2.price=30500;
		Laptop l3=new Laptop();
		l3.brand="Victus";
		l3.price=40000;
		
		
		Laptop[] laps= {l1,l2,l3};
		int temp=laps[0].price;
		for(Laptop x:laps) {
			if(x.price>temp) {
				temp=x.price;
			}
			
		}
		l1.gettotal(laps);
		System.out.print(temp);
		
	}


}
