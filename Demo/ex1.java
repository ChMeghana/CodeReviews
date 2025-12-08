import java.util.*;
import java.util.stream.*;

public class ex1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> numbers = IntStream.rangeClosed(1, 10000)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Even numbers using streams:");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        long end = System.currentTimeMillis();
        System.out.println("\nTime taken: " + (end - start) + " ms");
    }
}
