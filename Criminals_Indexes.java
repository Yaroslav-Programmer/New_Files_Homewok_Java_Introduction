package com.company;
import java.lang.String;
public class Criminals_Indexes {
    public static void main(String[] args) {
        String name = "Юсюз Ярослав";
        System.out.println("Prisoner number: " + prisonerNumber(name));
    }

    private static int prisonerNumber(String name) {
        int index = 0;
        for (char chars : name.toUpperCase().toCharArray()) {
            if (Character.isLetter(chars)) { // Find this method to check if name have letters not numbers
                index = index + chars;
            }
        }
        return index;
    }
}
/*
В тюрьме для особо опасных преступников каждому заключенному присваивается номер.
Каждый номер рассчитывается на основе таблицы символов Unicode, в которой каждому символу соответствует число.
Посчитать сумму чисел своего имени и фамилии, заданных одной строкой через пробел (например, “Колоджеева Марьяна”). Данная сумма и будет номером заключенного.
 */