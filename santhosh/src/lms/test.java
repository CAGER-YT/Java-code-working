package lms;

public class test {
	public static void main(String[]args) {
		String a=args[0];
		if (a.contains(",")) {
			String[] b=a.split(",");
			System.out.println(b.length);
		}
		else {
		//String[] b=a.split(" ");
		System.out.println(args.length);
		}
//		int x=Integer.parseInt(a);
//		int c=x*x*x;
//		System.out.println(c);
		}
	}

