package collection;
import java.util.ArrayList;
public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Arun",108,"IT",'A',true);
		Student s2=new Student("Sanjay",118,"MECH",'c',false);
		Student s3=new Student("Kumar",805,"MCA",'d',false);
		Student s4=new Student("Manoj",111,"MECH",'A',true);
		Student s5=new Student("RAJESH",1118,"IT",'e',true);
		ArrayList<Student>students=new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
//		for(Student x:students) {
//		System.out.println(x);
//		}
		students.forEach(x->{
//			if(x.rollno<=108){
//		System.out.println(x);
//			}
			if(x.dept.contains("MECH")) {
				System.out.println(x);
			}
		});
	}
}
class Student{
	String name;
	int rollno;
	String dept;
	char section;
	boolean isMale;
	public Student(String n,int no,String d,char s,boolean i) {
		name=n;
		rollno=no;
		dept=d;
		section= s;
		isMale=i;
	}
	public String toString() {
		return "Name:"+name+", RollNo:"+rollno+", DEPT:"+dept+", SECTION:"+section+", MALE:"+isMale;
	}
}

//election bean class candidate name,candidate age,ismale,ward no,
//Same ward print 
//male 
//age >60;

//parking capacity , name is parkingavailable,parking price per hr;
//print only available;
//parking price>100;