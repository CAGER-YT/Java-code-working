package condition;

public class elseif {
	public static void main(String[] args) {
		

		//6to 11 good morning
		//12 to 17 good afternoon
		//18 to 20 good evening
		//21 to 24 good night
		//otherwise invalid input
		
		
		int hour=15;
		if ((hour>=6)&&(hour<=11)) {
			System.out.println("Good Morning");
		}
		else if((hour>=12)&&(hour<=17)) {
			System.out.print("Good Afternoon");
		}else if((hour>=18)&&(hour<=20)) {
			System.out.println("Good Evening");
		}else if((hour>=21)&&(hour<=24)) {
			System.out.println("Good Night");
		}else {
			System.out.println("Invalid Input");
		}
		
//		int salary=90000;
//		if ((salary>=10000)&&(salary<=30000)) {
//			System.out.println(salary*10/100+salary);
//		}else if((salary>=40000)&&(salary<=60000)) {
//			System.out.println(salary*15/100+salary);
//		}else if((salary>=70000)&&(salary<=100000)) {
//			System.out.println(salary*25/100+salary);
//		}else if((salary>=100000)) {
//			System.out.println(salary*35/100+salary);
//		}else {
//			System.out.println("Not eligible for pf");
//		}
	}
}
