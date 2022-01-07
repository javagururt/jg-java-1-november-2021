package student_stanislav_p.lesson_5_arrays_for_loop.level_2_intern;

  /*    Написашите программу, в которой:
                - создайте массив целых чисел длиной 3,
                - заполните каждую ячейку массива случайным числом,
     - посчитайте сумму всех ячеек и распечатайте ее на консоль.*/

import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_13 {


    public static void main(String[] args) {

        Random random = new Random();

        int sum = 0;

        int[] numbers = new int[3];

        for (int i=0; i<numbers.length;i++){

            numbers[i]=random.nextInt(100);

            sum = sum + numbers[i];

            System.out.println("Random number "+ (i+1) + " -> "+ numbers[i]);
        }

        System.out.println("Sum of all random numbers ->  "+sum);
    }
}

