package collection;
import java.util.ArrayList;
public class EmployeeID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>empId=new ArrayList<>();
		empId.add(50001);
		empId.add(40002);
		empId.add(30003);
		empId.add(10008);
		empId.add(80009);
//		for(int i=0;i<empId.size();i++) {
//			System.out.println(empId.get(i));
//		}
//		for(int x:empId) {
//			if(x>30008) {								//enhanced for with condition
//			System.out.println(x);
//			}
//		}
//		empId.forEach(x->System.out.println(x));    //for each print
		
//		empId.forEach(x->{							//for each with condition 
//			if(x>30008) {
//				System.out.println(x);
//			}
//		});
		
//		for(int i=empId.size()-1;i>=0;i--) {
//			System.out.println(empId.get(i));
//		}
		ArrayList<Boolean>tempemp=new ArrayList<>();
		tempemp.add(true);
		tempemp.add(false);
		tempemp.add(true);
//		for(int i=0;i<tempemp.size();i++) {
//			if(tempemp.get(i)==false)
//			System.out.println(tempemp.get(i));
//		}

		System.out.println(empId);
		ArrayList<Character>tempchar=new ArrayList<>();
		tempchar.add('s');
		tempchar.add('a');
		tempchar.add('n');
		tempchar.add('d');
		tempchar.add('y');
//		for(int i=0;i<tempchar.size();i++) {
//			System.out.println(tempchar.get(i));
//		}
	}

}
