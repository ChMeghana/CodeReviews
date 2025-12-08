package org.example.interfaces;
interface Auditable2 {}

class Product implements Auditable2 {}

public class I9MarkerTest {
    public static void main(String[] args) {
        Product p = new Product();

        if (p instanceof Auditable2)
            System.out.println("Audit enabled");
    }
}
