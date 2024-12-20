package task;

public class Concat {

    public static void main(String[] args) {
        String name1="JAVA";
        String name2="developer";
        String name3=concat(name1,name2);
        System.out.println(name3); 
    }

    public static String concat(String name1, String name2) {
        String result = name1.substring(0,2)+name2+name1.substring(2);
        return result;
    }
}
