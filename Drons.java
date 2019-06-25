package com.company;

import java.util.Scanner;
import java.lang.String;

public class Drons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("X coordinate of the first circle center:");
        double x1 = scanner.nextDouble();

        System.out.println("Y coordinate of the first circle center:");
        double y1 = scanner.nextDouble();

        System.out.println("Radius of the first circle:");
        double r1 = scanner.nextDouble();

        System.out.println("X coordinate of the second circle center:");
        double x2 = scanner.nextDouble();

        System.out.println("Y coordinate of the second circle center:");
        double y2 = scanner.nextDouble();

        System.out.println("Radius of the second circle:");
        double r2 = scanner.nextDouble();

        System.out.println("The circles " + (isIntersect(x1, y1, x2, y2, r1, r2) ? "" : "don't") + " intersect.");


    }

    public static boolean isIntersect(double x1, double y1, double x2, double y2,double r1, double r2){

        double centerDistance = Math.sqrt((Math.pow(x2, 2) - Math.pow(x1, 2)) + (Math.pow(y2, 2) - Math.pow(y1, 2)));
        double radiusDistance = r1 + r2;
        return centerDistance <= radiusDistance;

    }
}