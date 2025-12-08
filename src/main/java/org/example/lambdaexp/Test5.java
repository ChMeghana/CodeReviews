package org.example.lambdaexp;
import java.util.*;
import java.util.function.*;

public class Test5 {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<Integer, Integer> square = n -> n * n;
        Consumer<Integer> printer = n -> System.out.println(n);

        nums.stream()
                .filter(isEven)
                .map(square)
                .forEach(printer);
    }
}

