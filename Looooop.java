package com.company;
import java.lang.String;
public class Looooop {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println(i);
            for (int j = 0; j < 9; j++){
                System.out.println(j);
                if(i!=4 && j!=4){
                    System.out.println(i + "" + j);
                }
            }
        }
    }
}
