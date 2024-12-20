package Java8_static;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import methodRefrence.FindMax;


public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(101,"Kumar",10000,27,"male");
		Employee e2=new Employee(103,"Santhosh",11000,24,"male");
		Employee e3=new Employee(104,"Manoj",15000,22,"amle");
		Employee e4=new Employee(102,"Rajesh",22000,24,"male");
		Employee e5=new Employee(108,"Kiruba",8000,23,"male");
		Employee e6=new Employee(109,"Sandhiya",12000,21,"female");
		Employee e7=new Employee(107,"Arun",14000,23,"male");
		Employee e8=new Employee(105,"Joel",30000,25,"male");
		Employee e9=new Employee(110,"Arjun",15000,27,"male");
		Employee e10=new Employee(111,"Gomathi",12500,27,"female");
		ArrayList<Employee>employees =new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		employees.add(e10);
//		employees.forEach(x->System.out.println(x));
		int maxSalary = Employee.findMaxSalary(employees);
		System.out.println("Maximum salary: " + maxSalary);
		List<Employee> femaleEmployees = Employee.findFemaleEmployees(employees);
		femaleEmployees.forEach(System.out::println);
	}
}
class Employee{
	private int id;
	private String name;
	private int salary;
	private int age;
	private String gender;
    public static int findMaxSalary(List<Employee> employees) {
        return employees.stream()
                        .mapToInt(Employee::getSalary)
                        .max()
                        .orElse(Integer.MIN_VALUE);
    }
    public static List<Employee> findFemaleEmployees(List<Employee> employees) {
        return employees.stream()
                      .filter(e -> e.getGender().equalsIgnoreCase("female"))
                      .collect(Collectors.toList());
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String role) {
		this.gender = role;
	}
	public Employee(int id, String name, int salary, int age, String role) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.gender = role;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", Gender=" + gender + "]";
	}

}