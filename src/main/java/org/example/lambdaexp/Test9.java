package org.example.lambdaexp;
import java.util.function.BiFunction;

public class Test9 {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> safeDivide = (a, b) -> {
            try {
                return a / b;
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
                return 0;
            }
        };

        System.out.println(safeDivide.apply(10, 0));
    }
}

