package streams;

import java.util.Arrays;
import java.util.List;

public class TotalNumberPresent {

	public static void main(String[] args) {
		List x=Arrays.asList(1,2,3,4);
		long y=x.stream().count();
		System.out.println(y);
	}
}
