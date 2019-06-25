package com.company;

import java.util.Scanner;
import java.lang.String;

public class loopop {
    public static void main(String[] args) {
        double sum = 0;
        int num = 0;
        int quantity = 0;
        Scanner scanner = new Scanner(System.in);

        while (num != -1) {
            num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            quantity++;

        }
        System.out.println("Sum: " + sum);
        System.out.println("Quantity: " + quantity);
        System.out.println(sum / quantity);
    }


}
