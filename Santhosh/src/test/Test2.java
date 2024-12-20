package test;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
        String str = "javahj is a programming language";
        String arr[]=str.split(" ");
        String con=String.join("", arr);
        Set<Character> seen = new LinkedHashSet<>();

        System.out.println(con);
        
        char a=con.chars().mapToObj(c-> (char) c).filter(ch->seen.add(ch)).findFirst().get();
        
       System.out.println(a);
	}
}
