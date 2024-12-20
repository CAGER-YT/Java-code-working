package for2;

public class Student {
	public static void main(String[] args) {
		String[] names= {"Meena","Arun","Roja","Selvam"};
//		for(int a=0;a<names.length;a++) { //forwaord string 
//			System.out.println(names[a]);
//		}
		for(String n:names){
			String temp="";
			
			for(int i=n.length()-1;i>=0;i--) {
				temp+=n.charAt(i);
			}
			System.out.println("Original Name:"+n);
			System.out.println("Reverse Name:"+temp);
		}
		
	}

}
