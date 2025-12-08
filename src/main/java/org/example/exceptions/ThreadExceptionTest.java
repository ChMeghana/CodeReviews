package org.example.exceptions;

public class ThreadExceptionTest {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            throw new RuntimeException("Thread failed!");
        });

        t.setUncaughtExceptionHandler((thread, e) -> {
            System.out.println("Caught in main thread: " + e.getMessage());
        });

        t.start();
    }
}

