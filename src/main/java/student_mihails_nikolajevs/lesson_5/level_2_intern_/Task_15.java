package student_mihails_nikolajevs.lesson_5.level_2_intern_;
/*
апишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль,
 - увеличьте значение каждой ячейки на 2,
 - выведите значение каждой ячейки на консоль.
 */

import java.util.Random;

public class Task_15 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] number = new int[3];

        for (int i = 0; i < number.length; i++) {

            number[i] = random.nextInt(50);

            System.out.println(" Enter Random Number " + (i + 1) + " : " + number[i]);

            number[i] = number[i] + 2;}

        for ( int i = 0; i < number.length; i++) {

            System.out.println(" New Value Of Number " + (i + 1) + " : " + number[i]);
        }
    }
}
