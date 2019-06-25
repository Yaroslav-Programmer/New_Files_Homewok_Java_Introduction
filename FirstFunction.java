package com.company;
import java.lang.String;
public class FirstFunction {

    public static void main(String[] args) {

        double n1 = 1;
        double n2 = 2;
        double s = sum(n1, n2);
        print(s);

        double z1 = 100;
        double z2 = 1000000;
        double zSum = sum(z1, z2);

        print(zSum);
    }

    public static double sum(double num1, double num2) {

        double sum = num1 + num2;
        return sum;

    }

    public static double calc(double y1, double y2) {

        double calc = y1 + y2;
        return calc;

    }


    public static void print(double result) {

        System.out.println("Result is: " + result);


    }
}




