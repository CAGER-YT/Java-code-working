package task;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        int count = 10; 
        
        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
              .limit(count)
              .map(fib -> fib[0])
              .forEach(System.out::println);
    }
}
	