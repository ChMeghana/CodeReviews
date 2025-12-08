package org.example.lambdaexp;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Test2 {
    public static void main(String[] args) {

        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;
        MathOperation div = (a, b) -> a / b;

        System.out.println(add.operate(5, 3));
        System.out.println(sub.operate(5, 3));
        System.out.println(mul.operate(5, 3));
        System.out.println(div.operate(10, 2));
    }
}
