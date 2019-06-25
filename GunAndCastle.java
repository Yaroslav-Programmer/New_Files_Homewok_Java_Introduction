package com.company;

import java.util.Scanner;
import java.lang.String;

public class GunAndCastle {
    public static final int START_CASTLE = 1000;
    public static final int END_CASTLE = 1500;

    public static void main(String[] args) {
        System.out.println("Input distance: ");
        Scanner scanner = new Scanner(System.in);
        double way = scanner.nextDouble();
        System.out.println("Your distance is : " + calcDistance(way));
    }
    public static double calcDistance(double distance){
        if(distance < START_CASTLE || distance > END_CASTLE){
            System.out.println("MISS!");
        }else{
            System.out.println("You're in" );
        }

        return distance;
    }
}
