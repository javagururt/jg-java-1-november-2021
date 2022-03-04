package student_mihails_nikolajevs.lesson_5.level_2_intern_;
/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте среднее значение и выведите его на консоль.
 */

import java.util.Random;
public class Task_14 {

    public static void main(String[] args) {

        Random random = new Random();

        double sum = 0;

        double average;

        int[] number = new int[3];

        for (int i = 0; i < number.length; i++) {

            number[i] = random.nextInt(50);

            sum = sum + number[i];

            System.out.println(" Number " + (i + 1) + " : " + number[i]);
        }
            average = sum / number.length;

            System.out.println(" AVERAGE OF ALL NUMBERS : " + average);

    }
}
