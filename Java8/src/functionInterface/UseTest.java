package functionInterface;

import java.util.Arrays;
import java.util.List;

public class UseTest {

	public static void main(String[] args) {
//		Test t=(b)->{return b+1;};
		
//		System.out.println(t.getNumber(10));
		
//		Test t1=(name,age)->{System.out.println("Name"+name+" age:"+age);};
		
//		t1.getName("Santhosh", 24);
		
		Test t2=()->{System.out.println("Hello");};
		t2.getName();
		
		List<String> x= Arrays.asList("Santhosh","Kumar","Jana","Nathan","Balaji","Mani");
		
		for(String i:x) {
			System.out.println(i);
		}
	}
}
