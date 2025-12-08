package Collections;


import java.util.Stack;

public class Stack1 {

    public static int evaluatePostfix(String expression){
        Stack<Integer> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args)  {
        String exp = "532*+4-";
        int result = evaluatePostfix(exp);

        System.out.println("Result = " + result);
    }
}

