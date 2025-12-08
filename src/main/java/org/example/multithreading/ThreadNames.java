package org.example.multithreading;
public class ThreadNames {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()), "Alpha");
        Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName()), "Beta");
        Thread t3 = new Thread(() -> System.out.println(Thread.currentThread().getName()), "Gamma");

        t1.start(); t2.start(); t3.start();
    }
}
