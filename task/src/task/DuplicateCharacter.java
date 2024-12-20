package task;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String name = "NishanthiKumar";

        Map<Character,Long>charCounts=name.chars()
                                             .mapToObj(c->(char)c)
                                             .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        charCounts.entrySet().stream()
                  .filter(entry->entry.getValue() > 1)
                  .map(Map.Entry::getKey)
                  .forEach(System.out::println);
    }
}

