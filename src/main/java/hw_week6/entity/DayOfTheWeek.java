package hw_week6.entity;

import java.util.Scanner;

public class DayOfTheWeek {

    enum MyDay {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main (String[] args) {
        MyDay today = MyDay.MONDAY;
        switch (today) {
            case SATURDAY, SUNDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Working day");
                break;


        }

    }
}
