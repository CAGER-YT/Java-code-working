package placement;

public class charCount {
	
	public static void charCount(String[] a) {
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]="$";
				}
			}
			if(a[i]!="$"&&count>1) {
				System.out.print(a[i]+count);
			}else if(a[i]!="$"){
				System.out.print(a[i]);
			}
		}
	}
//	Convert array into string
//	 Input : String[] a = { "t", "e", "e", "s", "s", "s", "h" }
//	 Output : te2s3h


	public static void main(String[] args) {
		String[] a = { "t", "e", "e", "s", "s", "s", "h" };
		charCount(a);
	}
}
