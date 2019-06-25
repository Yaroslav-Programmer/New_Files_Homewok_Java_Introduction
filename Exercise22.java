package com.company;
import java.util.Scanner;
import java.lang.String;
public class Exercise22 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Input an integer age of first person: ");
        int age1 = scanner1.nextInt();

        System.out.println("Input an integer age of second person: ");
        int  age2 = scanner1.nextInt();

        System.out.println("Input an integer age of third person: ");
        int  age3 = scanner1.nextInt();

        int oldest = agesOfPersons(age1, age2, age3);
        System.out.println("The oldest person " + oldest + " years old ");

        if(oldest > age1) {
            System.out.println("The oldest person is older than first one by " + (oldest - age1));
        }
        if(oldest > age2) {
            System.out.println("The oldest person is older than second one by " + (oldest - age2));
        }
        if(oldest > age3) {
            System.out.println("The oldest person is older than third one by "  + (oldest - age3));
        }

    }
    public static int agesOfPersons(int age1, int age2, int age3){
        return Math.max(Math.max(age1, age2), age3);
    }
}
