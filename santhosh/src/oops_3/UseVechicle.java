package oops_3;

public class UseVechicle {

	public static void main(String[] args) {
		Cat c1=new Cat();
		System.out.println(c1.drinking("milk"));
		System.out.println(c1.sound("meow"));
		System.out.println(c1.sleep("Sleeping"));
	}

}
// animal class
//sleep
//unimp drinking
//sound
//
//cat 

abstract class Animal{
	public String sleep(String s) {
		return s;
	}
	public abstract String drinking(String d);
	public String sound(String s) {
		return s;
	}
	
}
class Cat extends Animal{
	public String drinking(String d) {
		return "Cat drinks "+d;
	}
}
