package student_andrei_karamnov.lesson_5_arrays_for_loop.level_2_intern;

import teacher.annotations.CodeReview;

/*Написашите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте сумму всех ячеек и распечатайте ее на консоль.*/
@CodeReview(approved = true)
class Task_13 {
    public static void main(String[] args) {
        int[] randomInt = new int[3];
        int sum = 0;
        for (int i = 0; i < randomInt.length; i++){
            randomInt[i] = (int)(Math.random() * 999);
            sum = sum + randomInt[i];
            }
        System.out.println("Sum array: " + sum);
        }
    }

