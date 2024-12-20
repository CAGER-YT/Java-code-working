package collection;
import java.util.ArrayList;

public class UseElection {
	//election bean class candidate name,candidate age,ismale,ward no,
	//Same ward print 
	//male 
	//age >60;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Election p1=new Election("Kumar",27,true,120);
		Election p2=new Election("Manoj",67,true,130);
		Election p3=new Election("Senthil",65,true,130);
		ArrayList<Election>elections=new ArrayList<>();
		elections.add(p1);
		elections.add(p2);
		elections.add(p3);
		int w=p1.wardno;
		for(Election x:elections) {
			if(x.wardno==w) {
				w=x.wardno;
			}
			if(x.isMale==true) {
				if(x.age>60) {
					System.out.println(x);
				}
			}
		}
		
	}

}
class Election{
	String cname;
	int age;
	boolean isMale;
	int wardno;
	public Election(String n,int a,boolean is,int w) {
		cname=n;
		age=a;
		isMale=is;
		wardno=w;
		
	}
	public String toString() {
		return "Wardno:"+wardno+", Name:"+cname;
	}
}