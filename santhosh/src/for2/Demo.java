package for2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruit[]= {"Apple","Banana","Carrot","Orange"};
		if(fruit.length>=4) {
			System.out.println(fruit[0].charAt(0));
			System.out.println(fruit[1].charAt(1));
			System.out.println(fruit[2].charAt(2));

		}else {
			System.out.println("Invalid Input");
		}
//		for(int i=0;i<fruit.length;i++) {
//			System.out.println(fruit[i].charAt(i));
//		}

	}

}
