package org.example.collections;
import java.util.*;

public class C26 {
    public static void main(String[] args) {
        List<String> deck = new ArrayList<>();
        String[] suits = {"♠","♥","♦","♣"};
        String[] ranks = {"A","2","3","4","5"};
        for (String s : suits) for (String r : ranks) deck.add(r + s);
        Collections.shuffle(deck);
        System.out.println(deck.subList(0,5));
    }
}
