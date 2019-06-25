package com.company;
import java.lang.String;
public class Exercise11 {
    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        int y = calculateAreaAndPerimeter(a,b);


        double RATE_PER_HOUR = 25;
        double WORKS_HOURS = 8;
        double WORK_DAYS = 5;
        double WEEKS_IN_YEAR = 52;
        double x = calculateSalary(RATE_PER_HOUR,WORKS_HOURS,WORK_DAYS,WEEKS_IN_YEAR);


        double AB = 6;
        double AC = 16;
        double Angle = 60;
        double CosOfAngle = 0.5;
        double z = calculateAreaAndPerimeter2(AB,AC,CosOfAngle);


        double r1 = 1;
        double r2 = 0.5;
        double r3 = 0.2;
        double coefficient = 0.7;
        double res2 = 1.33;
        double z2 = calculateMassOfTheSnowman(r1,r2,r3,coefficient,res2);



    }
    public static int calculateAreaAndPerimeter(int a, int b){
        int S = (a*b) / 2;
        double x = Math.pow(a,2) + Math.pow(b,2);
        double c = Math.sqrt(x);
        double P = a + b + c;
        System.out.println("--------------------------------------------");
        System.out.println("Area of the triangle is : " + S + " cm^2 ");
        System.out.println("Perimeter of the triangle is : " + P + " cm ");
        System.out.println("--------------------------------------------");
        return S;

    }
    public static double calculateSalary(double RATE_PER_HOUR,double WORKS_HOURS, double WORK_DAYS,double WEEKS_IN_YEAR){
        double salary = RATE_PER_HOUR * WORKS_HOURS * WORK_DAYS * WEEKS_IN_YEAR;
        System.out.println("--------------------------------------------");
        System.out.println("Salary is : " + salary);
        System.out.println("--------------------------------------------");
        return salary;
    }
    public static double calculateAreaAndPerimeter2(double AB, double AC, double CosOfAngle){
        double bc = Math.pow(AB, 2) + Math.pow(AC, 2) - 2 * AB * AC * CosOfAngle;
        double BC = Math.sqrt(bc);
        double P = AB + BC + AC;
        double p = 0.5 * P; // Где p - полупериметр
        double S0 = (p*((p-AB)*(p-BC)*(p-AC)));
        double S1 = Math.sqrt(S0);
        double S = Math.round(S1);
        System.out.println("--------------------------------------------");
        System.out.println("Perimeter1 of triangle is : " + P + " cm ");
        System.out.println("Area1 of the triangle is : " + S + " cm^2 ");
        System.out.println("--------------------------------------------");
        return S;
    }
    public static double calculateMassOfTheSnowman(double r1, double r2, double r3, double coefficient,  double res2){
        double V1 = ((res2) * (Math.PI) * Math.pow(r1,3));
        double V2 = ((res2) * (Math.PI) * Math.pow(r2,3));
        double V3 = ((res2) * (Math.PI) * Math.pow(r3,3));


        double m1 = coefficient * V1;
        double m2 = coefficient * V2;
        double m3 = coefficient * V3;
        double m0 = m1 + m2 + m3;
        double m = Math.round(m0);
        System.out.println("--------------------------------------------");
        System.out.println("Mass of the snowman is : " + m + "kg");
        System.out.println("--------------------------------------------");
        return m;
    }
}
