package oops;

public class UseArmstrong {

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        System.out.println(a.findArmstrong(153)); 
    }
}

class Armstrong {
    public boolean findArmstrong(int num) {
        int originalNumber = num;
//        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum =sum+(digit*digit*digit);
            num /= 10;
        }

        return sum == originalNumber;
    }
}
