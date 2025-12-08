package org.example.interfaces;
import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaSingleExp {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // Lambda without parentheses around single parameter
        Consumer<Integer> printNumber = n -> System.out.println(n);

        // Using forEach to print all numbers
        //numbers.forEach(printNumber);

        // Inline lambda with parentheses and multiple statements
        System.out.println("Even numbers:");
        numbers.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}