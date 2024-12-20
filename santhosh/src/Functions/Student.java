package Functions;

public class Student {
	public void displayMark(int eng,int mat,int sci,int soc,int tamil) {

			System.out.println("English:"+eng+"\n"
					+"Mathematics:"+mat+"\n"+
					"Science:"+sci+"\n"
					+"Social:"+soc+"\n"+
					"Tamil:"+tamil
					);
	}
	public void findtotal(){
		int eng=100;
		int mat=87;
		int sci=94;
		int soc=67;
		int tamil=99;
		int total=eng+mat+sci+soc+tamil;
		System.out.println(total);
	}


}
