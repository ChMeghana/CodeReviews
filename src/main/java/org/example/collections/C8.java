package org.example.collections;
import java.util.*;

public class C8 {
    public static void main(String[] args) {
        TreeSet<Integer> seats = new TreeSet<>(Arrays.asList(1, 2, 3, 5, 7, 8, 10));
        int booked = 5;
        Integer nextAvailable = seats.higher(booked);
        System.out.println("Booked seat: " + booked);
        System.out.println("Next available seat: " + nextAvailable);
    }
}
