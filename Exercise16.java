package com.company;

 import java.util.Scanner;
 import java.lang.String;
 public class Exercise16 {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println(evenORodd(scanner.nextInt()) ? "TRUE" : "FALSE");

             }
             public static boolean evenORodd(int number){
                return number % 2 == 0;
             }
 }

