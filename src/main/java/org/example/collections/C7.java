package org.example.collections;
import java.util.*;

public class C7 {
    public static void main(String[] args) {
        TreeSet<Integer> transactions = new TreeSet<>(Arrays.asList(
                5000, 12000, 30000, 45000, 60000, 25000, 15000
        ));

        SortedSet<Integer> range = transactions.subSet(10000, 50001);
        System.out.println("Transactions between 10,000 and 50,000: " + range);
    }
}
