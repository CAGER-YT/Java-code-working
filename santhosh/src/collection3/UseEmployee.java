package collection3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(101,"Kumar",10000,27,"IT");
		Employee e2=new Employee(103,"Santhosh",11000,24,"IT DEV");
		Employee e3=new Employee(104,"Manoj",15000,22,"Tech");
		Employee e4=new Employee(102,"Rajesh",22000,24,"Dev");
		Employee e5=new Employee(108,"Kiruba",8000,23,"Cyber");
		Employee e6=new Employee(109,"Sathish",12000,21,"Backend");
		Employee e7=new Employee(107,"Arun",14000,23,"Frontend");
		Employee e8=new Employee(105,"Joel",30000,25,"ITI");
		Employee e9=new Employee(110,"Arjun",15000,27,"ITI");
		Employee e10=new Employee(111,"Gowtham",12500,27,"Dev");
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
		List<Employee>x=employees.stream().filter(a->a.getSalary()>15000).collect(Collectors.toList());//return whole data whose salary is >15000
		List<String>y=employees.stream().filter(a->a.getSalary()>15000).map(a->a.getName()).collect(Collectors.toList());//return name whose salary is >15000
		List<Employee>e=employees.stream().filter(a->a.getSalary()==15000).distinct().collect(Collectors.toList());//return same data whose salary is equal 15000
		List<Integer>f=employees.stream().filter(a->a.getRole().contains("Dev")&&a.getSalary()>20000).map(a->a.getAge()).collect(Collectors.toList());
		List<String>g=employees.stream().map(a->a.getName()).filter(a->a.length()>5).collect(Collectors.toList());//after mapping and filtering
		List<Integer>d=employees.stream().map(a->a.getSalary()).distinct().collect(Collectors.toList());//distinct
		List<String>k=employees.stream().map(a->a.getName()).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		List<String>l=employees.stream().map(a->a.getName()).skip(3).limit(5).collect(Collectors.toList());
		List<Employee>xx=employees.stream().filter(a->a.getSalary()>15000).collect(Collectors.toList());//return whole data whose salary is >15000
		List<Employee>xz=employees.stream().filter(a->a.getAge()>20).collect(Collectors.toList());
		List<Integer>dd=employees.stream().map(a->a.getSalary()).distinct().collect(Collectors.toList());//distinct
//		HashMap<Integer,Integer>dd1=employees.stream().map(a->a.getSalary()).distinct().collect(Collectors.toMap(employees.getId(),Integer));//distinct

//		xz.forEach(o->System.out.println(o));
//		//map return
//		Map<Integer, Employee>cx=employees.stream().filter(a->a.getAge()>20).collect(Collectors.toMap(a->a.getId(), b->b));
//		cx.forEach((u,i)->System.out.println(u+""+i));
//		//set return
//		Set<Employee>xy=employees.stream().filter(a->a.getAge()>20).collect(Collectors.toSet());
//		xy.forEach(o->System.out.println(o));
//		long c=employees.stream().count();
//		long d=employees.stream().filter(a->a.getAge()>23).count();
//		System.out.println(d);
//		l.forEach(z->System.out.println(z));
//		Integer maxSalaryEmployee = employees.stream().map(a->a.getSalary())
//                .max((o1, o2) -> Integer.compare(o1, o2))
//                .get();
//		Employee minSalaryEmployee = employees.stream()
//                .min((o1, o2) -> Integer.compare(o1.getSalary(), o2.getSalary()))
//                .get();
//		System.out.println(maxSalaryEmployee);
//		System.out.println(minSalaryEmployee);
//		int any variable name= 
		int max=employees.stream().map(a->a.getSalary()).max(Comparable::compareTo).get();
		int min=employees.stream().map(a->a.getSalary()).min(Comparable::compareTo).get();

		int secmax=employees.stream().map(a->a.getSalary()).distinct().sorted(Collections.reverseOrder()).skip(1).max(Comparable::compareTo).get();
		boolean secmin=employees.stream().map(a->a.getSalary()).distinct().sorted().anyMatch(a->a==15000);
		Integer  max1=employees.stream().map(a->a.getSalary()).sorted(Collections.reverseOrder()).skip(1).findFirst().get();
//		System.out.println(max1);
		IntSummaryStatistics st = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary));
//		System.out.println(st);
		Map<String, List<Employee>> employeesR = employees.stream().collect(Collectors.groupingBy(Employee::getRole));
		System.out.println(employees.stream().map(x1->x1.getSalary()).sorted().skip(6).findFirst().get());
		System.out.println(dd.hashCode());
		int code=dd.hashCode();
//		System.out.println(code%16);
//		System.out.println(secmin);
	}
}
class Employee{
	private int id;
	private String name;
	private int salary;
	private int age;
	private String role;
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
	public Employee(int id, String name, int salary, int age, String role) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", role=" + role + "]";
	}
	
}