package condition;

public class Switch {
	public static void main(String[] args) {
		
//	
//	int days=8;
//	switch(days) {
//	case 1:
//		System.out.println("Monday");
//		break;	
//	case 2:
//		System.out.println("Tuesday");
//		break;
//	case 3:
//		System.out.println("Wednesday");
//		break;
//	case 4:
//		System.out.println("Thursday");
//		break;	
//	case 5:
//		System.out.println("Friday");
//		break;
//	case 6:
//		System.out.println("Saturday");
//		break;
//	case 7:
//		System.out.println("Sunday");
//		break;
//	default:
//		System.out.println("Invalid Input");
//	}
//	
	char direction='N';
	int a=10,b=20;
	switch(direction) {
	case 'N':
//		if(a>b) {
//			System.out.println(a+"is greater than b");
			boolean c=a>b;
//		}
		System.out.println("North");
		break;
	case 'S':
		System.out.println("South");
		break;
	case 'E':
		System.out.println("East");
		break;
	case 'W':
		System.out.println("West");
		break;
	default:
		System.out.println("Invalid Input");
		
}
}
}
//employee name, age,phone, salary 
//3 instance find lowest salary
//print salary and all employee name to  upper case
