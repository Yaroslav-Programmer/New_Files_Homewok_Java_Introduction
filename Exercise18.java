package com.company;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
public class Exercise18 {
    public static void main(String[] args) {
        System.out.println("Input first component of quadratic equation: ");
        Scanner scanner1 = new Scanner(System.in);
        double a = scanner1.nextDouble();

        System.out.println("Input second component of quadratic equation: ");
        Scanner scanner2 = new Scanner(System.in);
        double b = scanner2.nextDouble();

        System.out.println("Input third component of quadratic equation: ");
        Scanner scanner3 = new Scanner(System.in);
        double c = scanner3.nextDouble();

        System.out.println("Distance: " + distance(a, b, c));
    }

     public static double distance(double a, double b, double c) {
        double D = Math.pow(b, 2) - (4 * a * c); // Formula of discriminant == b^2 * 4ac
        if(D > 0){
            double x1 =  ((-1) * b - Math.sqrt(D)) / (2 * a);
            double x2 = ((-1) * b + Math.sqrt(D)) / (2 * a);
            double distance = Math.abs(x2 - x1);
            return distance;

        }
        else{
            System.out.println("D > 0 or D = 0. It's ERROR: Incorrect input data!");

            return 0;
        }
    }
}


