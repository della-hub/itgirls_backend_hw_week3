package hw_week7_2.util;

import java.util.*;

public class BracketCheck {

    public static boolean bracketsChecker (String expr) {

        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i=0; i<expr.length(); i++) {

            char x = expr.charAt(i);

            if (x=='(' || x== '[' || x== '{') {

                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check=='{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check=='(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check=='{' || check=='(')
                        return false;
                    break;


            }
        }
        return (stack.isEmpty());
    }
}
