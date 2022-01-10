package student_stanislav_p.lesson_5_arrays_for_loop.level_2_intern;


/*    Напишите программу, в которой:
            - создайте массив целых чисел длиной 3,
            - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль.*/


import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_12 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] number = new int[3];

        for (int i = 0; i < number.length; i++) {

            number[i]= random.nextInt(100);

            System.out.println(number[i]);

        }

    }

}

