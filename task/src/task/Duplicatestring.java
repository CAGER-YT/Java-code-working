package task;

public class Duplicatestring {

    public static void main(String[] args) {
        String p = "i am working as java developer";
        String r = stringDuplicate(p);
        System.out.println("Output:"+r);
    }
    public static String stringDuplicate(String p) {
        p = p.replaceAll("\\s","");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < p.length(); i++) {
            char cc = p.charAt(i);
            if (p.indexOf(cc) != i && result.indexOf(String.valueOf(cc)) == -1) {
                result.append(cc).append(" ");
            }
        }
        return result.toString().trim();
    }
}
