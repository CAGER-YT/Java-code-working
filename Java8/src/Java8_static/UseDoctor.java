package Java8_static;

public class UseDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cardiologist c1=new Cardiologist();
		System.out.println("DocName:"+c1.docName("Kumar")+"\n"+
				"DocWorkedDays:"+c1.workedDays(4)+"\n"+
				"DocSalary:"+c1.docSalary(15000)+"\n"+
				"DocDept:"+Doctor.docNo(10));
	}

}
interface Doctor{
	public static String docNo(int id) {
		if(id>1000) {
			return "Surgeon";
		}else {
			return "General";
		}
	}
	public String docName(String n);
	public String workedDays(int d);
	public default int docSalary(int s) {
		if(s>30000) {
			return s+10;
		}else {
			return s+5;
		}
	}
}

class Cardiologist implements Doctor{
	public String docName(String n) {
		return n;
	}
	public String workedDays(int d) {
		if(d>5) {
			return "Need Rest";
		}else {
			return "Need to work";
		}
	}
	public int docSalary(int s) {
		if(s>30000) {
			return s+10;
		}else {
			return s+5;
		}
	}
}