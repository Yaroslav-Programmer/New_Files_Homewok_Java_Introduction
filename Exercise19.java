package com.company;

import java.util.Scanner;
import java.lang.String;

public class Exercise19 {
    public static void main(String[] args) {
        System.out.println("You need to input some integer number between this numbers: 1, 2, 3; " );
        System.out.println("If u input 1 - you will turn left and die :( " );
        System.out.println("If u input 2 - you will turn right and lose a horse" );
        System.out.println("If u input 3 - you will go straight and find treasure " );

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int number1 = numbersandchoises(number);

        //int number2 = scan.nextInt();
        //int number3 = scan.nextInt();


    }
    public static int numbersandchoises(int number1 ){
        if(number1 == 1){
            System.out.println("You turn left and die");
        }else if(number1 == 2){
            System.out.println("You right and lose your horse");
        }else if(number1 == 3){
            System.out.println("You go straight and find treasure!");
        }else {
            System.out.println("Not that number!");
        }

        return number1;
    }
}
