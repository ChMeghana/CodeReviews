package org.example.multithreading;
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread high = new Thread(() -> System.out.println("High Priority"));
        Thread norm = new Thread(() -> System.out.println("Normal Priority"));
        Thread low  = new Thread(() -> System.out.println("Low Priority"));

        high.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);

        high.start();
        norm.start();
        low.start();
    }
}
