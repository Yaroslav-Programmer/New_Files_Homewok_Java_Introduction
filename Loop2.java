package com.company;
import java.lang.String;
public class Loop2 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println("DBG >>> i=" + i);
            for (int k = 0; k < 9; k++) {
                System.out.println("DBG >>> k=" + k);
                if (i != 4 && k != 4)
                    System.out.println(i + "" + k);

            }
        }
    }

}
