package functionInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncInterfaceTypes {

	public static void main(String[] args) {
		Function<Integer,String>a=(x)->"Values is"+(x+1000); //<Input,Output>return type 
		System.out.println(a.apply(100));
		Consumer<Integer>b=(x)->System.out.println(x+100);//void type
		b.accept(200);
		Supplier<String>c=()->"Hi";//no parameter & void type
		System.out.println(c.get());
		Predicate<Integer>d=(x)->x>100;//return type true or false
		System.out.println(d.test(200));
	}
}
