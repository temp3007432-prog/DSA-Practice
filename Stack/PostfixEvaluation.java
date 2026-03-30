package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostfixEvaluation {
    public static void main() {
        String str = "235*+";
        System.out.println(str);
        System.out.println(Evaluation(str));

    }

    public static int Evaluation(String str) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') continue;
            if (Character.isLetterOrDigit(c)) {
                stack.push(c - '0');
            } else {
                int temp2 = stack.pop();
                int temp1 = stack.pop();

                switch (c) {
                    case '^':
                        stack.push((int) Math.pow(temp1, temp2));
                        break;
                    case '*':
                        stack.push(temp1 * temp2);
                        break;
                    case '/':
                        stack.push(temp1 / temp2);
                        break;
                    case '+':
                        stack.push(temp1 + temp2);
                        break;
                    case '-':
                        stack.push(temp1 - temp2);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
