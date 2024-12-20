package task;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SampleMap {
	public static void main(String[] args) {
//		Map<Integer,String>m=new HashMap<>();
		Map<Integer,String>m=new ConcurrentHashMap();

		m.put(101, "Nisha");
		m.put(102, "Arun");
		m.put(103, "Karthick");
		
		for(String x:m.values()) { //thread modification exception
			//fail fast -- system stop
			//fail safe --alternate solution
			m.put(105, "Kumar");
		}
		System.out.println(m);
	}

}
