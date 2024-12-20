package day2;

public class UsePen {
	public static void main(String[]Args) {
		pen p1=new pen();
		p1.brand="Brill";
		p1.price=20;
		p1.color="black";
		p1.isWeight=true;
		pen p2=new pen();
		p2.brand="parker";
		p2.price=70;
		p2.color="blue";
		String[] c=p1.brand.split("i");
		System.out.println("To upper case:"+p1.brand.toUpperCase()+"\n"+"\t"
		+p2.brand.toUpperCase()+"\n"
		+p1.brand.contains("''")+"\n"+
		p1.color.equals(p2.color)
		+"\n"+"split:"+c[1]+"\n"+
		"length of color:"+p1.color.length()+"   "+p2.color.length()+
		"\n"+p1.isWeight
		);
		
		
	}

}
