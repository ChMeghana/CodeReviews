package org.example.lambdaexp;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");

        // Lambda
        list.forEach(s -> System.out.println(s));

        // Method reference
        list.forEach(System.out::println);
    }
}
