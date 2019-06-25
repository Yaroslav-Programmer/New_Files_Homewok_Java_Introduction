package com.company;
import java.lang.String;
public class Bits {
    public static void main(String[] args) {
        int a = 342;
        System.out.println(~a); // не равно(переворот)

        int b = 277;
        int c = 432;
        System.out.println(b & c); // и

        System.out.println(b | c); // или

        System.out.println(b ^ c); // XOR

        int d = 64;
        int e = 3;
        int z = d << e;
        System.out.println(Integer.toBinaryString(z));
        System.out.println(Integer.toBinaryString(d));
        System.out.println(z);


    }
}