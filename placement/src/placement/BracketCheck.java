package placement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BracketCheck {

	public static void main(String[] args) {
		
		Stack<Character>x=new Stack<>();
//		String a="{}([)[]]";
//		String a="[]{}()";
		
//		boolean c=a.chars().mapToObj(b->(char) b).allMatch(b->{
//			if("{([".indexOf(b) != -1) {
//				x.push(b);
//				return true;
//			}else if("])}".indexOf(b) != -1) {
//				if(x.isEmpty()) {
//					return false;
//				}
//				char top=x.pop();
//				return (top=='{'&& b=='}')||(top=='['&& b==']')||(top=='('&& b==')');
//			}
//			return true;
//		});
//		System.out.println(c && x.isEmpty() ? "balanced":"not balanced");
		int arr[]= {10,25,30,14,20,1};
		List<String>x1=new ArrayList<>();
		
		if(x1.isEmpty()) {
			System.out.println(x1+"is null");
		}else{
			System.out.println("is not null");
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args,int a) {
		

		
	}
}
