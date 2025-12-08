package org.example.multithreading;
public class HelloThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException ignored) {}
        });

        t.start();
    }
}
