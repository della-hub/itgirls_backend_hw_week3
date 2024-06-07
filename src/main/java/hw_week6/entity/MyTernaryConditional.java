package hw_week6.entity;

import java.util.Scanner;

public class MyTernaryConditional {
    public static void main (String [] args) {

        System.out.print("Enter an integer and press enter ");
        Scanner inputInt = new Scanner(System.in);
        int num = inputInt.nextInt();

        String result = num%2 == 0 ? "четное" : "нечетное";
        System.out.println(result);
    }
}
