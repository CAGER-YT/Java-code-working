package collection2;
import java.util.HashMap;
import java.util.Iterator;
public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e1=new Employee(101,"Kumar",10000,27,"IT");
//		Employee e2=new Employee(103,"Santhosh",100000,24,"IT DEV");
//		Employee e3=new Employee(104,"Manoj",15000,22,"Tech");
//		Employee e4=new Employee(102,"Rajesh",20000,24,"Dev");
//		Employee e5=new Employee(108,"Kiruba",8000,23,"Cyber");
//		Employee e6=new Employee(109,"Sathish",12000,21,"Backend");
//		Employee e7=new Employee(107,"Arun",14000,23,"Frontend");
//		Employee e8=new Employee(105,"Joel",30000,25,"ITI");
//		Employee e9=new Employee(110,"Arjun",15000,27,"ITI");
//		Employee e10=new Employee(111,"Gowtham",20000,27,"Dev");
		
		HashMap<Integer,Employee>employees=new HashMap<>(10);
		HashMap<Integer,Employee>newemployees=new HashMap<>();
//		Iterator<Employee>itr=employees.values().iterator();
//		Iterator<Integer>itr1=employees.keySet().iterator();

//		employees.put(e1.getId(), e1);
//		employees.put(e2.getId(), e2);
//		employees.put(e3.getId(), e3);
//		employees.put(e4.getId(), e4);
//		employees.put(e5.getId(), e5);
//		employees.put(e6.getId(), e6);
//		employees.put(e7.getId(), e7);
//		employees.put(e8.getId(), e8);
//		employees.put(e9.getId(), e9);
//		employees.put(e10.getId(), e10);
		employees.put(1,new Employee(101,"Kumar",10000,27,"IT"));
		employees.put(2,new Employee(103,"Santhosh",100000,24,"IT DEV"));
		employees.put(3,new Employee(111,"Gowtham",20000,27,"Dev"));
		employees.put(4,new Employee(104,"Manoj",15000,22,"Tech"));
		employees.put(5,new Employee(102,"Rajesh",20000,24,"Dev"));
		employees.put(6,new Employee(108,"Kiruba",8000,23,"Cyber"));
		employees.put(7,new Employee(109,"Sathish",12000,21,"Backend"));
		employees.put(8,new Employee(107,"Arun",14000,23,"Frontend"));
		employees.put(9,new Employee(105,"Joel",30000,25,"ITI"));
		employees.put(10,new Employee(101,"Kumar",10000,27,"IT"));
		employees.put(11,new Employee(103,"Santhosh",100000,24,"IT DEV"));
		employees.put(12,new Employee(111,"Gowtham",20000,27,"Dev"));
		employees.put(13,new Employee(104,"Manoj",15000,22,"Tech"));
		employees.put(14,new Employee(102,"Rajesh",20000,24,"Dev"));
		employees.put(15,new Employee(108,"Kiruba",8000,23,"Cyber"));
		employees.put(16,new Employee(109,"Sathish",12000,21,"Backend"));
		employees.put(17,new Employee(107,"Arun",14000,23,"Frontend"));
		employees.put(18,new Employee(105,"Joel",30000,25,"ITI"));
		employees.put(19,new Employee(110,"Arjun",15000,27,"ITI"));

		
//		while(itr.hasNext()) {
//			if(itr.next().getSalary()<15000) {
//				itr.remove();
//			}
//		}
//		
//		while(itr1.hasNext()) {
//			if(itr1.next()==101) {
//				itr1.remove();
//			}
//		}
		
//		employees.keySet().forEach(x->{
//			if(itr.hasNext()) {
//				if(itr.next()==101) {
//					itr.remove();
//				}
//			}
//		});
		System.out.println(employees);

//		employees.values().forEach(x->System.out.println(x));
//		for(Integer x:employees.keySet()) {
//			System.out.println(employees.get(x));
//		}
//		employees.forEach((x,y)->System.out.println(x+" "+y));
//		employees.keySet().forEach(x->System.out.println(x));
//		employees.values().forEach(x->{
//			if(x.getName().endsWith("h")) {
//				System.out.println(x);
//			}
//		});
//		for(Integer x:employees.keySet()) {
//			System.out.println(x+" "+employees.get(x));
//		}
//		int temp=e1.getAge();
//		int s=e1.getSalary();
//
//		for(Employee x:employees.values()) {
//			if(x.getAge()<temp) {
//				temp=x.getAge();
//				s=x.getSalary();
//			}
//		}
//		for(Integer x:employees.keySet()) {
////			if(employees.get(x).getName().toLowerCase().startsWith("s")) {
////				System.out.println(employees.get(x));
////			}
//			System.out.println(employees.get(x));
//		}
		
//		for(Employee x:employees.values()) {
//				if(x.getRole().contains("IT")&&x.getSalary()>20000) {
//					newemployees.put(x.getId(), x);
//				}
//			}
//			newemployees.values().forEach(x->System.out.println(x));
//			if(x.getAge()==temp) {
//				System.out.println("Age "+x.getAge()+"Junior Employee "+x.getName()+" salary is "+x.getSalary());			
//			}
			

//		System.out.println(s);
//		for(Employee x:employees.values()) {
//			if(x.getAge()==temp) {
//				System.out.println("Junior Employee "+x.getName()+" salary is "+x.getSalary());			
//				}
//		}
//		employees.values().forEach(x->{
//			if(x.getAge()<25&&x.getSalary()>=20000) {
//				System.out.println(x);
//			}
//		});
//		for(Employee x:employees.values()) {
//			if(x.getName().toLowerCase().contains("a")||x.getName().toLowerCase().contains("e")||x.getName().toLowerCase().contains("i")||x.getName().toLowerCase().contains("o")||x.getName().toLowerCase().contains("u")) {
//				System.out.println(x.getAge()+" "+x.getRole());
//			}
//		}
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