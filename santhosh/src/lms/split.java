package lms;

public class split {
	public static void main(String[] args) {
		String a=args[0];
//		String [] b= a.split("");
//		String []c=b[1].split("@");
//		String []d=c[1].split("=");
//		String []e=d[1].split("1205");
//		boolean f=a.contains("0-9");
//		System.out.println(b[0]+"-"+c[0]+"-"+d[0]+"-"+e[1]);

		StringBuilder b=new StringBuilder(a).reverse();
		System.out.println(b);
	}
}
//public class UseCar {
//	public static void main(String[] args){
//		Cars []=new Cars[3];
////    Car[] cars[0]=new Car[];
//      cars[0].brand="Audi";
//      cars[0].model="A6";
//      cars[0].enginecc=3500;
//      cars[0].price=500000;
//      cars[0].taxPercentage=10;
//      cars[0].netPrice=cars[0].price*cars[0].taxPercentage/100;
//    Car cars[1]=new Car();
//      cars[1].brand="BMW";
//      cars[1].model="X6";
//      cars[1].enginecc=4200;
//      cars[1].price=400000;
//      cars[1].taxPercentage=15;
//      cars[1].netPrice=cars[1].price*cars[1].taxPercentage/100;
//    Car cars[2]=new Car();
//      cars[2].brand="Jaguar";
//      cars[2].model="FPACE";
//      cars[2].enginecc=5000;
//      cars[2].price=900000;
//      cars[2].taxPercenatage=10;
//      cars[2].netPrice=cars[2].price*cars[2].taxPercenatge/100;
//      
//      System.out.println(cars[0].brand+","+cars[1].brand+","+cars[2].brand);
//    }
//}
//public class Car{
//	String brand,model;
//  	int enginecc,price,taxPercentage,netPrice;
//}