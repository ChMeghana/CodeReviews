package org.example.collections;
import java.util.*;

public class C14 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> calls = new LinkedHashMap<>(16, 0.75f, true);
        calls.put("Login", 1);
        calls.put("FetchData", 2);
        calls.put("Logout", 3);
        calls.get("Login");
        System.out.println(calls);
    }
}
