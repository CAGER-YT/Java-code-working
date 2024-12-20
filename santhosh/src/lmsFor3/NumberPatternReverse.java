package lmsFor3;

public class NumberPatternReverse {
	public static void main(String[] args) {
		int num=6;
		for(int i=num;i>=0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(num-j-i+" ");
		}
		System.out.println();
		}
	}

}
//Output:
//1 2 3 4 5  	Sysout j+" "                
//1 2 3 4 
//1 2 3 
//1 2 
//1 

//6 6 6 6 6   	Sysout i+ " "
//5 5 5 5 
//4 4 4 
//3 3 
//2 

//1 1 1 1 1     Sysout num-i+1+" "
//2 2 2 2 
//3 3 3 
//4 4 
//5 

//6 5 4 3 2 	sysout num-j+1+" "
//6 5 4 3 
//6 5 4 
//6 5 
//6 

//-1 -2 -3 -4 -5  sysout num-j-i+" "
//0 -1 -2 -3 
//1 0 -1 
//2 1 
//3 

