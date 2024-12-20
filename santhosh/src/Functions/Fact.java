package Functions;

public class Fact {
	public int getFact(){
		int num=5;
		int fact=1;
		for(int i=1;i<num;i++) {//Without argument
			fact=fact*i;
		}
		return fact;
	}
	public int getFact1(int num){
		int fact=1;
		for(int i=1;i<num;i++) {	//with argument
			fact=fact*i;
		}
		return fact;
	}

}
