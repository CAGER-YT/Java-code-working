package condition;

public class salary {
	public static void main(String[] args) {
		int mark=10;
		if((mark>=90)&&(mark<=100)) {
			System.out.println("O Grade");
		}else if((mark>=80)&&(mark<=90)) {
			System.out.println("A Grade");
		}else if((mark>=70)&&(mark<=80)) {
			System.out.println("A+ Grade");
		}else if((mark>=60)&&(mark<=70)) {
			System.out.println("B Grade");
		}else if((mark>=50)&&(mark<=60)) {
			System.out.println("B+ Grade");
		}else if((mark>=40)&&(mark<=50)) {
			System.out.println("Average");
		}else if((mark>=30)&&(mark<=40)) {
			System.out.println("Below Averagee");
		}else if (mark<30) {
			System.out.println("Fail");
		}else {
			System.out.println("Invalid Input");
		}
		
	}

}
