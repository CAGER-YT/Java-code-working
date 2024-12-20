package task;

import java.util.Arrays;

public class SpaceCount {
    public static void main(String[] args) {
        String[] names = {"Nishanthi"," ","Kumar"," "};

        long spaceCount = Arrays.stream(names)
                                .reduce("",String::concat) 
                                .chars()                    
                                .filter(ch->ch==' ')    
                                .count();                   

        System.out.println(spaceCount);
    }
}
