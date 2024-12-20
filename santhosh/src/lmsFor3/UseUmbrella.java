package lmsFor3;

public class UseUmbrella {
	public static void main(String[]args){
	Umbrella umbrella1=new Umbrella();
    String [] a=args[0].split("@");
    umbrella1.brand=a[0];
    umbrella1.price=Integer.parseInt(a[1]);
    umbrella1.color=a[2];
    umbrella1.taxAmount=Integer.parseInt(a[3]);
    umbrella1.netPrice=umbrella1.price+umbrella1.taxAmount;
    Umbrella umbrella2=new Umbrella();
    String [] b=args[1].split("@");
    umbrella2.brand=b[0];
    umbrella2.price=Integer.parseInt(b[1]);
    umbrella2.color=b[2];
    umbrella2.taxAmount=Integer.parseInt(b[3]);
    umbrella2.netPrice=umbrella2.price+umbrella2.taxAmount;
    Umbrella umbrella3=new Umbrella();

    String [] c=args[2].split("@");
    umbrella3.brand=c[0];
    umbrella3.price=Integer.parseInt(c[1]);
    umbrella3.color=c[2];
    umbrella3.taxAmount=Integer.parseInt(b[4]);
    umbrella3.netPrice=umbrella3.price+umbrella3.taxAmount;
      
    Umbrella[] umbrellas={umbrella1,umbrella2,umbrella3};
     for(int i=0;i<umbrellas.length;i++){
     	System.out.println("BRAND="+umbrellas[i].brand+", COLOR="+umbrellas[i].color+", NETPRICE="+umbrellas[i].netPrice);
     }
    }
}
