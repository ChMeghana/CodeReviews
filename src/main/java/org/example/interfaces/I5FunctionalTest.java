package org.example.interfaces;

@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}

public class I5FunctionalTest {
    public static void main(String[] args) {

        // Lambda
        Operation add1 = (a,b) -> a + b;

        // Method reference
        Operation add2 = Integer::sum;

        // Anonymous class
        Operation add3 = new Operation() {
            public int apply(int a, int b) { return a + b; }
        };

        System.out.println(add1.apply(2,3));
        System.out.println(add2.apply(2,3));
        System.out.println(add3.apply(2,3));
    }
}
