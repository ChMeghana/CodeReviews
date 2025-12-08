package org.example.collections;
import java.util.*;

public class C20 {
    public static void main(String[] args) {
        ArrayDeque<String> back = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();
        String current = "Home";

        back.push(current);
        current = "Page1"; back.push(current);
        current = "Page2"; back.push(current);
        System.out.println("Current: " + current);

        forward.push(back.pop());
        current = back.peek();
        System.out.println("Back to: " + current);
    }
}
