package oops_3;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		It i1=new It();
		System.out.println(i1.showSalary(100000));
		System.out.println(i1.showEmployeeId(1008));
		System.out.println(i1.workingSector("Development"));
		i1.experience("Skilled");
		Technical t1=new Technical();
		System.out.println(t1.showSalary(1000));
		System.out.println(t1.showEmployeeId(1018));
		System.out.println(t1.workingSector("Technicial"));
		t1.experience("Unskilled");
	}

}
interface Technesian{
	public int showSalary(int s);
	public String workingSector(String ws);
	public int showEmployeeId(int sid);
}
interface Employee{
	public int showSalary(int s);
	public String workingSector(String ws);
	public int showEmployeeId(int sid);
}
class It implements Employee,Technesian{
	public int showSalary(int s) {
		return s;
	}
	public String workingSector(String ws) {
		return ws;
	}
	public int showEmployeeId(int sid) {
		return sid;
	}
	public void experience(String e) {
		System.out.println(e);
	}
}
class Technical implements Employee{
		public int showSalary(int s) {
			return s;
		}
		public String workingSector(String ws) {
			return ws;
		}
		public int showEmployeeId(int sid) {
			return sid;
		}
		public void experience(String e) {
			System.out.println(e);
		}
}
