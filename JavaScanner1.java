package com.company;

import java.util.Scanner;
import java.lang.String;

public class JavaScanner1 {

    private static final double EXCHANGE_RATE = 26.61;

    public static void main(String[] args) {
        Scanner usd_input = new Scanner(System.in);
        Scanner hrn_input = new Scanner(System.in);

        System.out.println("Please type in a USD amount:");
        double usd = usd_input.nextDouble();

        System.out.println("Please type in a HRN amount:");
        double hrn = hrn_input.nextDouble();

        System.out.printf("You got: %f HRN\n", convertUsdToHrn(usd));
        System.out.printf("You got: %f USD\n", convertHrnToUsd(hrn));

    }

    private static double convertUsdToHrn(double usd) {
        return usd * EXCHANGE_RATE;
    }

    private static double convertHrnToUsd(double hrn) {
        return hrn / EXCHANGE_RATE;
    }

}