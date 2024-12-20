package for2;

public class UseMarker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp="";
		Marker1[] markers=new Marker1[3];
		markers[0]=new Marker1();
		markers[0].brand="BRIL";
		markers[0].price=150;
		markers[0].isReffilable=true;
		markers[0].color="Black";
		markers[1]=new Marker1();
		markers[1].brand="Natraj";
		markers[1].price=250;
		markers[1].isReffilable=true;
		markers[1].color="Blue";
		markers[2]=new Marker1();
		markers[2].brand="camlin";
		markers[2].price=300;
		markers[2].isReffilable=true;
		markers[2].color="yellow";
//		for(int i=0;i<=markers.length-1;i++) {
//			System.out.println(markers[i].brand+markers[i].price);
//		}
		for(int j=markers.length-1;j>=0;j--) {
			temp+=markers[j].brand.charAt(j);
			System.out.println(temp);
		}
	}

}














//
//Read a value from args[]
//
//Assign the value to the variable named name 
//
//Now find count for repeated and non repeated characters in the string
//
//Sample input: bottle
//
//Then print the output in the following format:
//
//Repeated value count: 1 Non Repeated value count: 4
//
//
//
//Read the values from args[0] which is separated by comma
//
//Reverse the String and also each string should be reversed
//
//Sample input:I,am,a,developer
//
//Print the output in the following format:
//
//I ma a repoleved
//
//public class Done {
//  public static void main(String[] args){
//  	String[] a=args[0].split(",");
//    String[] b={a[0],a[1],a[2],a[3]};
//    String temp="",emp=" ";
//    for(int i=0;i<b.length;i++){
//    	for(int j=b[i].length()-1;j>=0;j--){
//        	temp=temp+b[i].charAt(j);
//        }
//    }
//    System.out.println(temp);
//  }
//}