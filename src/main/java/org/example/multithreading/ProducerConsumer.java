package org.example.multithreading;
import java.util.*;

class Shared {
    private final List<Integer> list = new ArrayList<>();
    private final int LIMIT = 5;

    public synchronized void produce() throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            while (list.size() == LIMIT) wait();

            list.add(i);
            System.out.println("Produced: " + i);
            notify();
        }
    }

    public synchronized void consume() throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            while (list.isEmpty()) wait();

            int val = list.remove(0);
            System.out.println("Consumed: " + val);
            notify();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Shared s = new Shared();

        Thread producer = new Thread(() -> {
            try { s.produce(); } catch (Exception ignored) {}
        });

        Thread consumer = new Thread(() -> {
            try { s.consume(); } catch (Exception ignored) {}
        });

        producer.start();
        consumer.start();
    }
}
