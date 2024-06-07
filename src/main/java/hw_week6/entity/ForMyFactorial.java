package hw_week6.entity;

import java.util.Scanner;

public class ForMyFactorial {

    public static void main (String[] args) {

        System.out.println("Enter an integer and press enter ");
        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();

            long myFact = 1;
            for (int i = 2; i <= n; i++) {
                myFact = myFact * i;
            }
            System.out.println(myFact);

    }
}
