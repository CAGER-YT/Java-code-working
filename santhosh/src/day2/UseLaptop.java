package day2;

public class UseLaptop {
	public static void main(String[]Args) {
		laptop l1=new laptop();
		l1.brand="Dell";
		l1.price=15000;
		l1.color="Silver";
		l1.isWarranty=true;
		char c=l1.brand.charAt(l1.brand.length()-3);
		System.out.println("UpperCase:"+l1.brand.toUpperCase()+"\n"+
		"Length:"+l1.brand.length()+"\n"+
		"Starts with D:"+l1.brand.startsWith("D")+"\n"+
		"last character:"+c+"\n"+
		"lowercase:"+l1.color.toLowerCase()
				);
	}

}
