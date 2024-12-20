package task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SampleList {
	
	public static void main(String[] args) {
//		List<String> li=new ArrayList<>();
		List<String> li=new CopyOnWriteArrayList();
		li.add("Nisha");
		li.add("kumar");
		li.add("Karthick");
		li.add("arun");
		for(String x:li) {
			li.remove("Karthick");
		}
		System.out.println(li);
	}

}
