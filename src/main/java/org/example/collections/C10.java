package org.example.collections;
import java.util.*;

public class C10 {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("Apples", 50);
        stock.put("Bananas", 10);
        stock.put("Oranges", 0);
        stock.put("Grapes", 25);

        System.out.println("Before removing low stock: " + stock);

        stock.entrySet().removeIf(entry -> entry.getValue() < 10);

        System.out.println("After removing low stock: " + stock);
    }
}
