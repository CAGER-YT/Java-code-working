package task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101, "Kumar", 10000, 27, "IT", "Male");
		Employee e2 = new Employee(103, "Santhosh", 11000, 24, "IT DEV", "Male");
		Employee e3 = new Employee(104, "Manoj", 15000, 22, "Tech", "Male");
		Employee e4 = new Employee(102, "Rajesh", 22000, 24, "Dev", "Male");
		Employee e5 = new Employee(108, "Kiruba", 8000, 23, "Cyber", "Male");
		Employee e6 = new Employee(109, "Sathish", 12000, 21, "Backend", "Male");
		Employee e7 = new Employee(107, "Arun", 14000, 23, "Frontend", "Male");
		Employee e8 = new Employee(105, "Joel", 30000, 25, "ITI", "Male");
		Employee e9 = new Employee(110, "Arjun", 15000, 27, "ITI", "Male");
		Employee e10 = new Employee(111, "Gowtham", 12500, 27, "Dev", "Male");
		ArrayList<Employee> employees = new ArrayList<>(List.of(e1,e2,e3,e4,e5,e5));
		Iterator i=employees.iterator();
		System.out.println(i+".");
//		System.out.println(employees);

//		Employee x=employees.stream().filter(y->y.getSalary()>15000).sorted(Comparator.comparingInt(Employee::getAge).reversed()
//				.thenComparing(Employee::getName, Comparator.reverseOrder())).findFirst().get();
//		System.out.println(x);
//		employees.stream().collect(Collectors.groupingBy(Employee::getAge)).forEach((a,y)->{System.out.println(a +""+ y);});
		//employees.stream().collect(Collectors.groupingBy(Employees::getAge).
}

class Employee {
	private int id;
	private String name;
	private int salary;
	private int age;
	private String role;
	private String gender;

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Employee(int id, String name, int salary, int age, String role, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.role = role;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", role=" + role
				+ gender + "]";
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}