package task;

public class Words {

    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        int number=22000;
        String numberInWords=convertToWords(number);
        System.out.println("Output: "+numberInWords);
    }

    public static String convertToWords(int number) {
        if (number==0){
            return "Zero";
        }

        if (number < 0){
            return "Minus"+convertToWords(-number);
        }

        String words="";

        if ((number/1000)>0) {
            words+=convertToWords(number/1000) + " Thousand ";
            number%=1000;
        }

        if ((number / 100) > 0) {
            words += convertToWords(number / 100) + " Hundred ";
            number%=100;
        }

        if (number > 0) {
            if (number < 10) {
                words+=units[number];
            } else if(number < 20) {
                words+=teens[number - 10];
            } else {
                words+=tens[number / 10]+" "+units[number % 10];
            }
        }

        return words;
    }
}
