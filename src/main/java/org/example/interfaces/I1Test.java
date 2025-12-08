package org.example.interfaces;

interface Flyable {
    default void move() { System.out.println("Flying..."); }
}

interface Swimmable {
    default void move() { System.out.println("Swimming..."); }
}

class Duck implements Flyable, Swimmable {
    @Override
    public void move() {
        Flyable.super.move();
        Swimmable.super.move();
        System.out.println("Duck finished moving.");
    }
}

public class I1Test {
    public static void main(String[] args) {
        new Duck().move();
    }
}
