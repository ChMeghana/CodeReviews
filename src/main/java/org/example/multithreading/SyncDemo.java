package org.example.multithreading;
class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();

        Thread t1 = new Thread(() -> table.printTable(2));
        Thread t2 = new Thread(() -> table.printTable(5));

        t1.start();
        t2.start();
    }
}
