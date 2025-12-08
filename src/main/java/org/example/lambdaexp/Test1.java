package org.example.lambdaexp;

@FunctionalInterface
interface Printer {
    void print(String msg);
}

public class Test1 {
    public static void main(String[] args) {
        Printer p = msg -> System.out.println(msg);
        p.print("Hello from Lambda!");
    }
}

