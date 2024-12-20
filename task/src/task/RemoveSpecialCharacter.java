package task;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String word = "nisha@26&09an";

        List<String> result = word.chars().mapToObj(c -> (char) c)
                            .filter(c -> c == '@' || c == '&' || c=='!')
                            .map(String::valueOf)
                            .collect(Collectors.toList());
        result.forEach(x->System.out.print(x));

    }
}

