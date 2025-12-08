package org.example.multithreading;
import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int task = i;
            service.submit(() -> System.out.println("Executing Task " + task));
        }

        service.shutdown();
    }
}
