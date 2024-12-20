package serilazationvsdeserilzation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerilizableStudent {

	public static void main(String[] args) {
		Student s1=new Student(1,"Santhosh");
		try {
		FileOutputStream file=new FileOutputStream("data.txt");
		ObjectOutputStream ofile=new ObjectOutputStream(file);
		ofile.writeObject(s1);
		ofile.flush(); 
		ofile.close();
		System.out.println("Sucess");

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
