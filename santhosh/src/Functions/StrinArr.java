package Functions;

public class StrinArr {
	public String even(String arr[]) {
		String temp=arr[0];
		char middle;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				if(arr[i].length()>temp.length()) {
					System.out.println(arr[i].charAt(arr[i].length()/2-1)+""+arr[i].charAt(arr[i].length()/2));
					temp=arr[i];
					
				}
			}
		}
		return temp;
	}
}
