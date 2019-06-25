package com.company;

import java.lang.String;

public class Exercise8 {
    public static void main(String[] args) {
        double AB = 6;
        double AC = 16;
        double Angle = 60;
        double CosOfAngle = 0.5; // Почему-то значение косинуса 60 градусов вместо 0.5, пишет -0.9524129804151563???(Do not pay attention)


        // Formula is  BC^2 = AB^2 + AC^2 - 2AB*AC * cos A

        //double bc = (2*(Math.pow(AB,2) + Math.pow(AC,2) - ((AB * AC))) * CosOfAngle) - Cтарая версия;


        double bc = Math.pow(AB, 2) + Math.pow(AC, 2) - 2 * AB * AC * CosOfAngle;
        double BC = Math.sqrt(bc);
        double P = AB + BC + AC;
        double p = 0.5 * P; // Где p - полупериметр
        double S0 = (p*((p-AB)*(p-BC)*(p-AC)));
        double S1 = Math.sqrt(S0);
        double S = Math.round(S1);


        System.out.println("Perimeter of triangle is : " + P + " cm ");
        System.out.println("Area of triangle is : " + S + " cm^2 ");


    }
}
