
package com.company;

import java.util.Scanner;
import java.lang.String;

public class Exercise13_11 {
    private static final int DAYS_IN_MONTH = 42;
    private static final int MONTHS_IN_YEAR = 10;

    public static void main(String[] args) {

        int DAYS_IN_YEARS = DAYS_IN_MONTH * MONTHS_IN_YEAR;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of days: ");
        int days = scanner.nextInt();

        System.out.println("Input the number of months: ");
        int months = scanner.nextInt();

        System.out.println("Input the number of years: ");
        int years = scanner.nextInt();

        daysSinceColonization(days, months, years);

        if (months <= 1 && years <= 1) {
            System.out.println("Days since colonization: " + (days));
        } else {
            System.out.println("Days since colonization: " + (days + ((months - 1) * DAYS_IN_MONTH) + ((years - 1)* DAYS_IN_YEARS)));
        }

    }

    public static void daysSinceColonization(int days, int months, int years) {

    }
}