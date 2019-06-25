package com.company;

import java.util.Scanner;

public class Birthday_Zodiacs {

    public static void main(String[] args) {

        int date_of_birthday = getNumbers();
        int month_of_birthday = getNumbers();

        int check = inputCases();

        checkNumbers(date_of_birthday,month_of_birthday);

    }

    private static int getNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a date of your birthday in this format: 1.(date of your birthday); 2.(month of your birthday) ");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("User input error");
            return getNumbers();
        }
    }
    private static int inputCases(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your birthday month from these options:" +
                " \n1.January\n2.February\n3.March\n4.April\n5.May\n6.June" +
                "\n7.July\n8.August\n9.September\n10.October\n11.November\n12.December ");

        int monthNumber = 0;
        if (scanner.hasNextInt()) {
            monthNumber = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не число! Повторите ввод!");
            return inputCases();
        }

        switch (monthNumber){
            case 1:
                System.out.println("You were born in January");
                break;
            case 2:
                System.out.println("You were born in February");
            case 3:
                System.out.println("You were born in March");
            case 4:
                System.out.println("You were born in April");
            case 5:
                System.out.println("You were born in May");
            case 6:
                System.out.println("You were born in June");
            case 7:
                System.out.println("You were born in July");
            case 8:
                System.out.println("You were born in August");
            case 9:
                System.out.println("You were born in September");
            case 10:
                System.out.println("You were born in October");
            case 11:
                System.out.println("You were born in November");
            case 12:
                System.out.println("You were born in December");
                default:
                    System.out.println("Incorrect input");
                    break;
        }
        return monthNumber;
    }

    private static boolean checkNumbers(int day, int month) {
        Scanner scanner = new Scanner(System.in);
        int date_of_birthday = scanner.nextInt();
        int month_of_birthday = scanner.nextInt();

        day = date_of_birthday;
        month = month_of_birthday;

        if (day >= 30 && month == 2) {
            System.out.println("There are only 29 days in February");
            return false;
        }
        if (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("It is impossible");
            return false;
        }
        if (day >= 32 && (month == 1 || month == 3 || month == 5 ||
                month == 7 || month == 8 || month == 10 || month == 12)) {
            System.out.println("It is impossible");
            return false;
        }
        return true;
    }
}
/*

     */