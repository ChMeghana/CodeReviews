package org.example.collections;
import java.util.*;

public class C15 {
    public static void main(String[] args) {
        String exp = "23*54*+9-";
        Stack<Integer> s = new Stack<>();
        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c)) s.push(c - '0');
            else {
                int b = s.pop(), a = s.pop();
                switch (c) {
                    case '+': s.push(a + b); break;
                    case '-': s.push(a - b); break;
                    case '*': s.push(a * b); break;
                    case '/': s.push(a / b); break;
                }
            }
        }
        System.out.println(s.pop());
    }
}
