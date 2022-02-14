package student_stanislav_p.lesson_10_junit.homework.level_5_middle;

/*
Метод может принимать до двух чисел разделённые запятой и возвращает их сумму.
Пример входной строки: “” or “1” or “1,2”. Для пустой строки сумма равна 0.
 */

import java.util.Scanner;

public class StringCalculator {
    int add(String numbers){

        String regex = requestRegex(numbers);

        String [] strings = stringArray(numbers,regex);

        int [] numbersArray = numbersArray(strings);

        int summ=0;

        for (int i = 0; i < numbersArray.length; i++) {

            summ=summ+numbersArray[i];

        }

        return summ;
    }


    String [] stringArray(String numbers, String regex){

        String [] strings1 = numbers.split ("\n");

        String [] strings = strings1[1].split (regex);

        return strings;
    }

    int [] numbersArray(String [] strings){

        int [] numbersArray = new int [strings.length];

        for (int i = 0; i < strings.length; i++) {

            numbersArray[i] = Integer.parseInt(strings[i]);

        }

        return numbersArray;
    }



    String requestRegex(String numbers) {


        String regex = numbers.substring(numbers.indexOf("[") + 1, numbers.indexOf("]"));


        return regex;

    }
}
