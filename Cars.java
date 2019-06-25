package com.company;
import java.util.Scanner;
import java.lang.String;
public class Cars {
    private static final int LENGTH_OF_THE_CONTAINER = 10;
    private static final int HEIGHT_OF_THE_CONTAINER = 4;
    private static final double WIDTH_OF_THE_CONTAINER = 2.5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a length of your car: ");
        int length = scanner.nextInt();
        int lengthEnclosure = LENGTH_OF_THE_CONTAINER / length;

        System.out.println("Input a height of your car: ");
        int height = scanner.nextInt();
        int heightEnclosure = HEIGHT_OF_THE_CONTAINER / height;

        System.out.println("Input a width of your car: ");
        int width = scanner.nextInt();
        int widthEnclosure = 0;
         widthEnclosure =(int) WIDTH_OF_THE_CONTAINER / width;

         boolean fitted  = isCarFit(length, height, width);
         if(fitted){
             System.out.println("You can put " + lengthEnclosure * heightEnclosure * widthEnclosure + " cars");
         }else {
             System.out.println("Car doesn't fitted");
         }
    }
    public static boolean isCarFit(double length, double height, double width){
        return(length <= LENGTH_OF_THE_CONTAINER &&
                height <= HEIGHT_OF_THE_CONTAINER && width <= WIDTH_OF_THE_CONTAINER);
    }
}