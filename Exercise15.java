package com.company;
import java.lang.String;

public class Exercise15 {
    public static final int T1 = 30;
    public static void main(String[] args) {

        int a1 = 16;
        int a2 = 10;

        double S1 = calculatemetres(a1,T1);
        double S2 = calculatemetres(a2,T1);

        if(S1 > S2){
            System.out.println(S1 + " is bigger than " +  S2);
            System.out.println("S1 is bigger than S2");
        }else{
            System.out.println(S2+  "is bigger than" +  S1);
            System.out.println("S2 is bigger than S1");
        }
    }
    public static double calculatemetres(int a1, int t1){
        return a1 * Math.pow(t1,2);
    }
}