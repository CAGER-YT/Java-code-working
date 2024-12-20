package oops;

public class ArrayPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,2,1};
		IntegerArray i=new IntegerArray();
		System.out.println(i.findPalindrome(num));
	}

}
class IntegerArray{
	public String findPalindrome(int num[]) {
		int start=0;
        int end=num.length-1;

        while (start<end) {
            if (num[start]!=num[end]) {
                return "Not a palindrome";
            }
            start++;
            end--;
        }
        return "Palindrome";
	}
}