package functionInterface;

public class UseCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=()->{
			return 10-8;
		};
//		Calculator add=(a,b)->{
//			return a+b;
//		};
//		Calculator sub=(a,b)->{
//			return a-b;
//		};
//		Calculator diff=(a,b)->{
//			if(a>b) {
//			return a;
//			}else {
//			return b;
//			}
//		};
//		Calculator mul=(a,b)->{
//			return a*b;
//		};
//		Calculator div=(a,b)->{
//			return a/b;
//		};
		System.out.println(c.math());
//		System.out.println("Add "+add.math(10, 20));
//		System.out.println("Sub "+sub.math(10, 20));
//		System.out.println("Diff "+diff.math(10, 20));
//		System.out.println("Mul "+mul.math(10, 20));
//		System.out.println("Div "+div.math(10, 20));
//		System.out.println(add.math1(5, 4));//default
//		System.out.println(Calculator.leng("test"));//static
	}

}
@FunctionalInterface
interface Calculator{
	//public int math(int a,int b);
	public int math();

	public default String math1(int a,int b) {
		if(a>b) {
			return a+" is greater";
		}else {
			return b+" is greater";
		}
	}
	public static String leng(String a) {
		if(a.length()>10) {
			return "String is big";
		}else {
			return "Small";
		}
	}

}