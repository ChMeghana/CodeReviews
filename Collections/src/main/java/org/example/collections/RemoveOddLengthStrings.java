package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveOddLengthStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Go");
        list.add("Csharp");
        list.add("Ruby");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            if (str.length() % 2 != 0) { // Checks if string length is odd
                itr.remove();
            }
        }

        System.out.println(list); // Output: [Java, Python, Csharp]
    }
}

