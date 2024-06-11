package hw_week6.entity;

import java.util.Scanner;

import hw_week6.entity.MyEnum;

public class DayOfTheWeek {



    public static void main (String[] args) {
        MyEnum.MyDay today = MyEnum.MyDay.MONDAY;
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
