package placement;

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class UseEmploye {
//	
//	public static void main(String[] args) {
//		Employee e1=new Employee("Kumar", 27, 30000);
//		Employee e2=new Employee("santhosh", 24, 50000);
//		Employee e3=new Employee("sathish", 22, 30000);
//		Employee e4=new Employee("manoj", 22, 45000);
//		Employee e5=new Employee("rajesh", 27, 60000);
//
//		List<Employee> e=new ArrayList<>();
//		e.add(e1);
//		e.add(e2);
//		e.add(e3);
//		e.add(e4);
//		e.add(e5);
//		Iterator<Employee> a=e.iterator();
////		System.out.println(a);
//        Employee target = e.get(4);  // Get the 4th element from the list
//
//        while (a.hasNext()) {
//            Employee current = a.next();
//            if (current.equals(target)) {
//                a.remove();  // Remove the element if it matches the target
//            } else {
//                System.out.println(current);
//            }
//        }
////		a.forEachRemaining(System.out::println);
////		Collections.sort(e);
////		e.forEach(x->System.out.println(x));
//		
////		Collections.sort(e, new AgeSort());
////		Collections.sort(e, new SalarySort());
////		e.forEach(x->System.out.println(x));
//		
////		e.parallelStream().forEach(System.out::println);
////		Collections.shuffle(e);
////		System.out.println(e);
////		System.out.println(e.get(1));/
////		Collections.reverse(e);
////		System.out.println(e);
//
//	}
//}


import java.util.ArrayList;
import java.util.List;

class Person implements Cloneable{
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class UsePerson {
    public static void main(String[] args) {
    	Person p1=new Person("Santhosh", 10, 100000);
    	Person p2= p1.clone();
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, 50000));
        people.add(new Person("Bob", 25, 45000));
        people.add(new Person("Christopher", 40, 100000));
        people.add(new Person("Diana", 35, 75000));

//		long sT=System.currentTimeMillis();

        // Grouping by the size of the name
//        Map<Integer, List<Person>> groupedByNameSize = people.parallelStream()
//                .collect(Collectors.groupingBy(person -> person.getName().length()));

//		long eT=System.currentTimeMillis();
//
//        // Printing the groups
//		
//		System.out.println("Time Taken:"+(eT-sT));
//
//        groupedByNameSize.forEach((size, group) -> {
//            System.out.println("Name size: " + size);
//            group.forEach(System.out::println);
//        });
        people.parallelStream().sorted().forEach(a->System.out.println(a));
    }
}
