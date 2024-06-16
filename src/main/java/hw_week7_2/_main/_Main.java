package hw_week7_2._main;

import hw_week7_2.util.BracketCheck;

import static hw_week7_2.util.BracketCheck.bracketsChecker;

public class _Main {

    public static void main (String[] args) {
        String expr = "([{}])";

        if (bracketsChecker(expr))
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
    }
}
