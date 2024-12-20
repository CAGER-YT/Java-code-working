package collection;
import java.util.ArrayList;
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>age=new ArrayList<>();
		age.add(20);
		age.add(25);
		age.add(65);
		age.add(16);
		age.add(10);
		age.add(18);
		ArrayList<Integer>newage=new ArrayList<>();
		for(Integer x:age) {
			if(x>18) {
				newage.add(x);
			}
		}
//		System.out.println(newage.get(0)+" "+newage.get(1)+" "+newage.get(2));
		
		ArrayList<String>name=new ArrayList<>();
		name.add("kumar");
		name.add("sathish");
		name.add("santhosh");
		name.add("rajesh");
		name.add("manoj");
		ArrayList<String>newname=new ArrayList<>();
		for(String s:name) {
			if(s.startsWith("s")) {
				newname.add(s);
			}
		}
		System.out.println(newname);
		for(String s:newname) {
			System.out.println(s);
		}

	}

}
