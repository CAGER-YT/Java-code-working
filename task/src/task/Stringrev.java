package task;

import java.util.Scanner;

public class Stringrev {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String a=s.nextLine();
		for (int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
	}
}
