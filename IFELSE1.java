package com.company;

import java.util.Scanner;
import java.lang.String;

public class IFELSE1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        System.out.println("Give " + calculate(score));
    }

    public static int calculate(int score) {
        int result = 0;
        if (score > 1000) {
            result = 5000;
        } else if (score >= 500) {
            result = 20000;
        } else if (score > 100) {
            result = 10000;
        }
        return result;
    }
}