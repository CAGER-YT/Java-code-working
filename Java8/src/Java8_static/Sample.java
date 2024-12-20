package Java8_static;

public class Sample {
	static int a=10;
	public Sample() {		//default constructor
//		a++;
		System.out.println(a);
	}
	public static String meth() {
		return "Hello";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1=new Sample();		//Increase the value in the memory using default constructor
		Sample s2=new Sample();
		Sample s3=new Sample();
		System.out.println(Sample.meth());		//static method calling with 
		System.out.println(meth());//method calling in single class
		System.out.println(a);//variable calling in single class
		System.out.println(Sample.a);			//return the final static variable value
	}
	static {
		System.out.println("This is static block");		//static block will be executed first
	}

}
//doctor
