package com.company;
import java.lang.String;
public class Exercise9_1 {
    public static void main(String[] args) {
        double r1 = 1;
        double r2 = 0.5;
        double r3 = 0.2;
        double coefficient = 0.7;
        double res2 = 1.33; // Приблизительное значение от 4/3


        //Формула для объема сферы = 4/3 * РI * r в степени 3, но почему-то на выходе пишет только PI(Это уже не важно)


        double V1 = ((res2) * (Math.PI) * Math.pow(r1,3));
        double V2 = ((res2) * (Math.PI) * Math.pow(r2,3));
        double V3 = ((res2) * (Math.PI) * Math.pow(r3,3));

            // Формула m = pV из физики

        double m1 = coefficient * V1;
        double m2 = coefficient * V2;
        double m3 = coefficient * V3;
        double m0 = m1 + m2 + m3;
        double m = Math.round(m0);

        System.out.println("Mass of the snowman is : " + m + "kg");
    }
}
