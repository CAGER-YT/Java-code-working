package interview;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Hash {
	
	public static void main(String[] args) {
		Hashtable<Integer, String> h=new Hashtable();
		h.put(101, "kumar");
		h.put(101, "kumar");
		h.put(104, "joel");
		h.put(102, "santhosh");
		h.put(103, "naveen");
		h.put(105, "rajesh");
		h.put(108, "sriram");
//		h.put(null, null);
//		System.out.println(h);
		h.remove(102);
//		System.out.println(h);
//		System.out.println(h.containsKey(108));//contains value
//		System.out.println(h.containsValue("sriram"));
        HashMap<Integer, String> c = new HashMap<>();
        LinkedList e=new LinkedList();
        LinkedList<String> e1=new LinkedList<>();
        PriorityQueue r=new PriorityQueue();
        PriorityQueue<String> r1=new PriorityQueue<>();
        System.out.println(r1.add("Kumar"));
//        System.out.println(r.offer(101));
////        r.add("Kumar");
//        System.out.println(r);
//        System.out.println(r1);
//        System.out.println(r.offer(true));
        System.out.println(r1.element());
//        c.put(101, "kumar");
//        c.put(101, "kumar");  // This will replace the previous entry with the same key
//        c.put(104, "joel");
//        c.put(102, "santhosh");
//        c.put(103, "naveen");
//        c.put(105, "rajesh");
//        c.put(108, "Sriram");
//        System.out.println(c);
	}

}
