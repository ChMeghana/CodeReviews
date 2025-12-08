package org.example.collections;
import java.util.*;

public class C19 {
    public static void main(String[] args) {
        String str = "madam";
        ArrayDeque<Character> dq = new ArrayDeque<>();
        for (char c : str.toCharArray()) dq.add(c);

        boolean isPal = true;
        while (dq.size() > 1)
            if (dq.removeFirst() != dq.removeLast()) { isPal = false; break; }

        System.out.println(isPal);
    }
}
