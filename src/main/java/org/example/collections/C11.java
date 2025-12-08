package org.example.collections;
import java.util.*;

public class C11 {
    public static void main(String[] args) {
        TreeMap<Long, Double> readings = new TreeMap<>();
        readings.put(1000L, 20.5);
        readings.put(2000L, 25.2);
        readings.put(3000L, 27.8);
        readings.put(4000L, 23.9);

        System.out.println(readings.subMap(1500L, 3500L));
    }
}
