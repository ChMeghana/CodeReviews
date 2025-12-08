package org.example.collections;
import java.util.*;

public class C21 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("One","Two","Three","Four"));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) if (it.next().length() % 2 != 0) it.remove();
        System.out.println(list);
    }
}
