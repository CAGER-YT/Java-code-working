package placement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListSort {
	
	public static void main(String[] args) {
		String a="santhosh";
        List<String> s = Arrays.asList("Banana", "Apple", "Orange", "Mango", "Grape","Banana", "Apple");
//        s.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
        Set<String> x=new HashSet(s);
        x.retainAll(s);
        System.out.println(x);
        char[] b = a.toCharArray();
        Character[] charArray = new Character[b.length];
        for (int i = 0; i < b.length; i++) {
            charArray[i] = b[i]; // Autoboxing char to Character
        }

        var c = Arrays.stream(charArray)
                      .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        
        System.out.println(c);
	}

}

