package interview;

public class Calculator {

	public synchronized int add(int a,int b) {//synchronized is use to execute the priority thread
		//priority range is 1-10
		//setPrioity(),
		return a+b;
	}
	
}
