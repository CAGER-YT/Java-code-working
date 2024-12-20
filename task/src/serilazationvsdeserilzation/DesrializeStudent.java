package serilazationvsdeserilzation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesrializeStudent {

	public static void main(String[] args) {
		try {
			ObjectInputStream os=new ObjectInputStream(new FileInputStream("data.txt"));
			Student s1=(Student)os.readObject();
			System.out.println(s1.id+" "+s1.name);
			os.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
