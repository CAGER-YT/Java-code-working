package lmsFor3;

public class NumberPattern {
	public static void main(String[] args) {
		int num=6;
		int sum=0;
		for(int i =1;i<num;i++) {
			for(int j=1;j<=i;j++) {
				sum=sum+1;
				System.out.print(sum+" "); 
				}
			System.out.println();
		}

	}

}

//6 
//5 6 
//4 5 6 
//3 4 5 6 
//2 3 4 5 6  	Sysout  num+j-i+" "

//6 
//7 6 
//8 7 6 
//9 8 7 6 
//10 9 8 7 6   Sysout  num-j+i+" "

//6 
//6 5 
//6 5 4 
//6 5 4 3 
//6 5 4 3 2     Sysout num-j+1+" "


//6 
//5 5 
//4 4 4 
//3 3 3 3 
//2 2 2 2 2      Sysout num-i+1+" "

//1 
//2 2 
//3 3 3 
//4 4 4 4 
//5 5 5 5 5       Sysout i+" " 

//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 	Sysout j+" " 

//1 
//2 3 
//4 5 6 
//7 8 9 10 		  sum=sum+1
//11 12 13 14 15  Sysout sum+" "
