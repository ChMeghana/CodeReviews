package org.example.collections;
import java.util.*;

public class C3 {
    public static void main(String[] args){
        LinkedList<String> operations = new LinkedList<>();
        operations.add("Add Apple");
        operations.add("Add Banana");
        operations.add("Remove Apple");
        System.out.println("Operations: " + operations);

        String last = operations.removeLast();
        System.out.println("Undo operation: " + last);
        System.out.println("Operations after undo: " + operations);
    }

}
