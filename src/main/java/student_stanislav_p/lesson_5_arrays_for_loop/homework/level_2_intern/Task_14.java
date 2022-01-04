package student_stanislav_p.lesson_5_arrays_for_loop.homework.level_2_intern;

  /*    Напишите программу, в которой:
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

        int[] numbers = new int[3];

        for (int i=0; i<numbers.length;i++){

            numbers[i]=random.nextInt(100);

            sum = sum + numbers[i];

            System.out.println("Random number "+ (i+1) + " -> "+ numbers[i]);
        }

        average = sum / numbers.length;

        System.out.println("Average of all random numbers ->  " + average);
    }
}

