package com.company;
import java.lang.String;
public class Exercise10_1 {
    public static void main(String[] args) {

        /*
        Я имел ввиду вот это
         */

        int number1 = 4;
        int number2 = 3;
        int number3 = 5;
        int number4 = 2;
        result(number1,number2,number3,number4);

        double num1 = 3;
        double num2 = 5;
        power(num1,num2);

        double a = 3;
        double b = 5;
        double c = 8;
        Math.abs(b);
        calculate(a,b,c);

        double a1 = 6;
        double b1 = 8;
        double c1 = 7;
        calculate2(a1,b1,c1);

        double a2 = 3;
        double b2 = 1;
        double c2 = 1;
        calculate3(a2,b2,c2);



        } // 1
        private static int result (int number1, int number2, int number3, int number4 ){
            int result = number1 + number2 * number3 / number4;
            System.out.println("Result №1 is : " + result);
            return result;

        } // 2
        private static double power(double num1, double num2){
           double result = (Math.pow(num1,2) + (Math.pow(num2,2))) / 2;
            System.out.println("Result №2 is : " + result);
            return result ;

        } //3
        private static double calculate(double a, double b, double c){
            double calculate3 = Math.ceil((a+b)/12 * c % 4 + Math.abs(b));
            System.out.println("Result №3 is : " + calculate3);
            return calculate3;

        }// 4
        private static double calculate2(double a1, double b1, double c1){
            double calculate2 = Math.ceil((a1-b1*c1)/(a1+b1)%c1);
            System.out.println("Result №4 is : " + calculate2 );
            return calculate2;

        }//5
        private static double calculate3(double a2, double b2, double c2){
            double calculate4 = (Math.abs(a2-b2) / (a2+b2)*3 - (Math.sqrt(c2)));
            System.out.println("Result №5 is : " + calculate4);
            return calculate4;

        }
    }