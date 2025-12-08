package org.example.lambdaexp;
import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        // Print all
        names.forEach(name -> System.out.println(name));

        // Print only names starting with C
        names.forEach(n -> {
            if (n.startsWith("C")) System.out.println(n);
        });
    }
}
