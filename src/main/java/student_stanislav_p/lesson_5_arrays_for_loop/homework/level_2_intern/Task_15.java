package student_stanislav_p.lesson_5_arrays_for_loop.homework.level_2_intern;


/*

Напишите программу, в которой:
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

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);

            System.out.println("Initial value random number " + (i+1) + " ->  " + numbers[i]);

            numbers[i]=numbers[i]+2;

        }


        for ( int i = 0; i < numbers.length; i++) {
            System.out.println("Increased value random number " + (i+1) + " ->  " + numbers[i]);
        }
    }
}
