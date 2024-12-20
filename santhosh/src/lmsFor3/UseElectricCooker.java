package lmsFor3;

public class UseElectricCooker {
	public static void main(String[]args){
   	ElectricCooker electricCooker1=new ElectricCooker();
      String [] a=args[0].split("#");
      electricCooker1.brand=a[0];
      electricCooker1.color=a[2];
      electricCooker1.price=Integer.parseInt(a[1]);
      electricCooker1.taxAmount=Integer.parseInt(a[3]);
      electricCooker1.netPrice=electricCooker1.price+electricCooker1.taxAmount;
   
    ElectricCooker electricCooker2=new ElectricCooker();
      String[] b=args[1].split("#");
      electricCooker2.brand=b[0];
	  electricCooker2.color=b[2];
      electricCooker2.price=Integer.parseInt(b[1]);
      electricCooker2.taxAmount=Integer.parseInt(b[3]);
      electricCooker2.netPrice=electricCooker2.price+electricCooker2.taxAmount;
   ElectricCooker electricCooker3=new ElectricCooker();
      String[] c=args[2].split("#");
      electricCooker3.brand=c[0];
      electricCooker3.color=c[2];
      electricCooker3.price=Integer.parseInt(c[1]);
      electricCooker3.taxAmount=Integer.parseInt(c[3]);
      electricCooker3.netPrice=electricCooker3.price+electricCooker3.taxAmount;
      ElectricCooker[] electricCookers={electricCooker1,electricCooker2,electricCooker3};
      for(int i=0;i<electricCookers.length;i++){
        System.out.println("BRAND= "
                           +electricCookers[i].brand+", COLOR= "
                           +electricCookers[i].color+", NETPRICE= "
                           +electricCookers[i].netPrice);
      }
    }
}
