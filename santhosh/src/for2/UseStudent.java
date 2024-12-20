package for2;

public class UseStudent {
	public static void main(String[] args) {
		
	Student1[] student1=new Student1[4];
	student1[0]=new Student1();
	student1[0].name="manoj";
	student1[0].age=20;
	student1[1]=new Student1();
	student1[1].name="Kumar";
	student1[1].age=26;
	student1[2]=new Student1();
	student1[2].name="Joel";
	student1[2].age=24;
	student1[3]=new Student1();
	student1[3].name="Santhosh";
	student1[3].age=24;
	for(int i=0;i<=student1.length-1;i++) {
		System.out.println("Student name "+(i+1)+":"+student1[i].name+
	" age "+":"+student1[i].age);
	}
	}
}
