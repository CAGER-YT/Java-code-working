package placement;

import java.time.LocalDateTime;

class Parent {
    public static String display() {
        System.out.println("Static method in Parent");
        return "jana";
    }
}

class Child extends Parent {
	public static String display() {
        System.out.println("Static method in Child");
        return "Santhosh";
    }
}

public class Main1 {
    public static void main(String[] args) {
        System.out.println(Parent.display());  // Calls Parent's static method
        System.out.println(Child.display());   // Calls Child's static method
        
        LocalDateTime a=LocalDateTime.now();
        System.out.println(a.getYear()-2);

        // Parent obj = new Child();
        // obj.display();     // Calls Parent's static method due to reference type
    }
}
