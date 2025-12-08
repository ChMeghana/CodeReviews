package org.example.lambdaexp;

@FunctionalInterface
interface MathOperation2 {
    int operate(int a, int b);
}

public class Test3 {

    static int calculate(int a, int b, MathOperation2 op) {
        return op.operate(a, b);
    }

    public static void main(String[] args) {
        System.out.println(calculate(10, 5, (x, y) -> x + y));
        System.out.println(calculate(10, 5, (x, y) -> x - y));
        System.out.println(calculate(10, 5, (x, y) -> x * y));
        System.out.println(calculate(10, 5, (x, y) -> x / y));
    }
}
