package org.example.streams;
import java.util.*;

public class UppercaseStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "spring", "react", "angular");

        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
