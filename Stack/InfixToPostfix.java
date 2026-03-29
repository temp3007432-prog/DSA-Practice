package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostfix {
    // SCOPE//
    // S: Scan from left to right.
    // C: Copy operands to output.
    // O: operator go to stack.
    // P: Parenthesis '(' goes to stack, when you see ')' then pop until you get
    // '('.
    // E: Empty the stack at the end.

    public static void main(String[] args) {
        String infix = "A+B*C-D/E^F";
        System.out.println("Infix is : " + infix);
        System.out.println("Postfix is : " + conversion(infix));
    }

    private static String conversion(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuffer output = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') continue;
            if (Character.isLetterOrDigit(c))
                output.append(c);

            else if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && stack.peek() != '(' && (precedence(stack.peek()) >= precedence(c))) {
                    output.append(stack.pop());
                }
                stack.push(c);
            }

        }
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return output.toString();
    }

    static int precedence(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

}
