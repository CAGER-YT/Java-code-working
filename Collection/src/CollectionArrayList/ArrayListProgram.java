package CollectionArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListProgram {
	
	public static void main(String[] args) {
		List<Employee>list=new ArrayList<>();
		Employee e1=new Employee("santhosh", 24);
		Employee e2=new Employee("Rajesh", 27);
		Employee e3=new Employee("santhosh", 24);

		System.out.println(e1.add());
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Set<Employee> set=new HashSet<>(list);
		
		System.out.println(set);
//		set.remove(set);
		
		Iterator<Employee> x=new Iterator<>() {
			
			@Override
			public Employee next() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		
	}

}

class Employee{
	String name;
	int age;
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	public int add() {
		return 1;
	}
}
