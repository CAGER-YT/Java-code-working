package collection2;
import java.util.HashMap;
public class LmsDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>lms=new HashMap<>(10,0.50f);
		lms.put(570, "Nisha");
		lms.put(1483, "Kumar");
		lms.put(1486, "Santhosh");
		lms.put(1489, "Manoj");	//add data into hashmap
		lms.put(1480, "Rajesh");
		lms.remove(570);//remove only using key
		lms.forEach((x,y)->System.out.println(x+":"+y)); //print both keys and values
		lms.keySet().forEach(x->System.out.println(x)); //keyset fuctions
		lms.values().forEach(x->{
			if(x.endsWith("h")) {
				System.out.println(x);
			}
	}); //values function
		for(Integer x:lms.keySet()) {
			System.out.println(x+" "+lms.get(x));//get function
		}

	}

}
