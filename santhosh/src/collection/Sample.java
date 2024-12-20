package collection;
import java.util.ArrayList;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>name=new ArrayList<>();
		name.add("Kumar");//add elements in arraylist
		name.add("Manoj");
		name.add("Sathish");
		name.add("Rajesh");
		name.set(1, "Santhosh");//set elements in arraylist
		name.add(0,"prasad");//add in specification
		System.out.println(name.get(0));//get elements from arraylist
		//System.out.println(name.remove(0));//remove elements from arraylist and replace the element with next index element
		System.out.println(name.get(0));
		System.out.println(name.size());//get size of arraylist
		System.out.println(name.get(0)+" "+name.get(1)+" "+name.get(2));
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
		}
	}
}
