package org.example.streams;
import java.util.*;

public class CountNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "John", "Arun", "Sneha", "Anil");

        long count = names.stream()
                .filter(n -> n.toLowerCase().startsWith("a"))
                .count();

        System.out.println("Count = " + count);
    }
}
