package placement;

import java.util.Comparator;

public class AgeSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.getAge()-o1.getAge();
	}
}
