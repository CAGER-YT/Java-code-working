package lmsFor3;

public class StringDuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="onesoft";
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				count=count+1;
				arr[j]='$';
				}
			}
			if(count==0 && arr[i]!='$') {
				System.out.println(arr[i]); //unique characters
			}
//			if(arr[i]!='$') {
//				System.out.println(arr[i]+":"+count);//removing duplicate character from banana o/p is ban
//			}
		}
	}

}
