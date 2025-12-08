package org.example.interfaces;

interface A {
    default void greet() { System.out.println("Hello from A"); }
}

interface B {
    default void greet() { System.out.println("Hello from B"); }
}

class MyClass implements A, B {
    @Override
    public void greet() {
        A.super.greet();
        B.super.greet();
        System.out.println("Resolved in MyClass");
    }
}

public class I2TestConflict {
    public static void main(String[] args) {
        new MyClass().greet();
    }
}
