package streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsStringDuplicate {

	public static void main(String[] args) {
		String x="Java is awesome to read is";
		String[] y= x.split(" ");
	
        Map<String, Long> z = Arrays.stream(y)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));        
        System.out.println(z);
	}
}
