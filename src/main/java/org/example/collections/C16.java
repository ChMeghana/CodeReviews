package org.example.collections;
import java.util.*;

public class C16 {
    public static void main(String[] args) {
        String exp = "A+(B*C-(D/E^F)*G)*H";
        Stack<Character> stack = new Stack<>();
        StringBuilder post = new StringBuilder();
        Map<Character, Integer> prec = Map.of('+',1,'-',1,'*',2,'/',2,'^',3);

        for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c)) post.append(c);
            else if (c == '(') stack.push(c);
            else if (c == ')') while (!stack.isEmpty() && stack.peek()!='(') post.append(stack.pop());
            else {
                while (!stack.isEmpty() && stack.peek()!='(' && prec.getOrDefault(stack.peek(),0)>=prec.getOrDefault(c,0))
                    post.append(stack.pop());
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) post.append(stack.pop());
        System.out.println(post);
    }
}
