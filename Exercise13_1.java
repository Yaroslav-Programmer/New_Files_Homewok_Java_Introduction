package com.company;
import java.lang.String;
public class Exercise13_1 {

    public static int days(int date, int month, int year) {
        int DAYS_IN_MONTH = 42;
        int MONTHS_IN_YEAR = 10;
        int DAYS_IN_YEAR = DAYS_IN_MONTH * MONTHS_IN_YEAR;
        int days = date + (month * DAYS_IN_MONTH) + (year * DAYS_IN_YEAR);
        return days;
    }

    public static void main(String[] args) {
        System.out.println("Days since colonization : " + days(40,9,12));
        System.out.println("Days since colonization : " + days(1,1,1));
        System.out.println("Days since colonization : " + days(34,7,56));
    }
}

