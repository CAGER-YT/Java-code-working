package lmsFor3;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="banana";
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				count=count+1;
				arr[j]='$';
				}
			}
			if(count>0 && arr[i]!='$') {
				System.out.println(arr[i]+":"+count);
			}
		}
	}

}
