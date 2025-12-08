package org.example.interfaces;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class I4StreamTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<Integer, Integer> square = n -> n * n;
        Consumer<Integer> printer = n -> System.out.println(n);

        list.stream()
                .filter(isEven)
                .map(square)
                .forEach(printer);
    }
}
