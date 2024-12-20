package placement;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FindAge {

	public static void main(String[] args) {
		LocalDate s= LocalDate.parse("2000-01-13");
		
		LocalDate n=LocalDate.now();
		n.getDayOfWeek();
		Period age =Period.between(s, n);
		System.out.println(age.getYears());
		System.out.println(n+" "+		n.getDayOfWeek());
	}
}
