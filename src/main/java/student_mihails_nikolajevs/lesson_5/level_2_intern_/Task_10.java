package student_mihails_nikolajevs.lesson_5.level_2_intern_;
/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива любым целым числом,
 - выведите значение каждой ячейки на консоль.
 */

import java.util.Arrays;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_10 {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6};

        System.out.println("Array: " + Arrays.toString(numbers));
    }
}
