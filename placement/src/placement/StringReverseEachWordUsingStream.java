package placement;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class StringReverseEachWordUsingStream {
	
//	public static void main(String[] args) {
//		String a="this is a java program";
//		String r=Arrays.stream(a.split(" "))
//				.map(x->new StringBuilder(x).reverse())
//				.collect(Collectors.joining(" "));
//		System.out.println(r);
//	}
//
//}



    public static void main(String[] args) {

        String dateInput = "2003-01-13";
        
        LocalDate date = LocalDate.parse(dateInput);
        
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        System.out.println("The day of the week for " + dateInput + " is " + dayOfWeek + "." + date.isLeapYear());
    }
}
