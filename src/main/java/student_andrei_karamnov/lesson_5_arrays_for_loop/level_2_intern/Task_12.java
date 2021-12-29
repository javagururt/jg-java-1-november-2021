package student_andrei_karamnov.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Arrays;

/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль.*/
class Task_12 {
    public static void main(String[] args) {
        int[] randomInt = new int[3];
        for (int i = 0; i < randomInt.length; i++)
            randomInt[i] = (int)(Math.random() * 999 );

            System.out.println("Random array: ");
        for (int i = 0; i < randomInt.length; i++){
            System.out.println(" " + randomInt[i]);
        }
    }
    }

