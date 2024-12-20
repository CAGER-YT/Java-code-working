package day1;

public class carinfo {
	public static void main(String [] args) {
		car c1 = new car();
		c1.Brand ="Audi";
		c1.Color= "Black";
		c1.price=165000;
		c1.airballon= true;
		c1.tax_percentage=12;
		c1.taxamount=c1.price*c1.tax_percentage/100;
		c1.discount_percentage=25;
		c1.discountamount=c1.price*c1.discount_percentage/100;
		c1.discounttotal =c1.price-c1.discountamount;
		
		System.out.println("Brand:"+c1.Brand+
				"\n"+"Color:"+c1.Color+
				"\n"+"Price:"+c1.price+
				"\n"+"Airballon:"+c1.airballon+
				"\n"+"Taxamount:"+c1.taxamount+
				"\n"+"DiscountAmount:"+c1.discountamount+
				"\n"+"Discounttotal:"+c1.discounttotal);
	}
}
