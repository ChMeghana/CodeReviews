package org.example.multithreading;
public class RunnableThread {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread is running...");
            }
        };

        new Thread(r).start();
    }
}
