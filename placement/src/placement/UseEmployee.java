package placement;

import java.util.function.Consumer;

public class UseEmployee extends Throwable {

	public static void main(String[] args) {
        Employee1 emp = new Employee1("John", 101);

        checkSpecialEntity(emp);
        Consumer<String> print = x -> System.out.println(x);
        print.accept("Hello");
	}
	
    public static void checkSpecialEntity(Object obj) {
        if (obj instanceof SpecialEntity) {
            System.out.println(obj + " is a SpecialEntity.");
        } else {
            System.out.println(obj + " is NOT a SpecialEntity.");
        }
    }
}

