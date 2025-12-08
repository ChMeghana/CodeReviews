package Collections;

import java.util.ArrayDeque;

public class Deque {

    public static boolean isPalindrome(String s) {
        ArrayDeque<Character> dq = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                dq.addLast(Character.toLowerCase(c));
            }
        }

        while (dq.size() > 1) {
            if (dq.removeFirst() != dq.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "Madam";
        System.out.println(isPalindrome(str));
    }
}
