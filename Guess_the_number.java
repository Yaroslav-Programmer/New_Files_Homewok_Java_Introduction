package com.company;

import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class Guess_the_number {
    public static void main(String[] args) {
        Random random = new Random();
        int number = 1 + random.nextInt(11 - 1);

        while (true) {
            System.out.println("Guess the number between 1 and 10: ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            if (num == number) {
                System.out.println("Yeah, you`re right!");
                break;
            } else if (num < number) {
                System.out.println("Higher");
            } else if (num > number) {
                System.out.println("Lower");
            }

        }
    }
}
