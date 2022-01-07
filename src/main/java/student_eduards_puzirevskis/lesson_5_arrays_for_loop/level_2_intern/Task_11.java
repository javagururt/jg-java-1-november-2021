package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Arrays;
import java.util.Scanner;

import teacher.annotations.CodeReview;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива числом, запрошенным у пользователя,
 - выведите значение каждой ячейки на консоль.
 */
@CodeReview(approved = true)
class Task_11 {
    public static void main(String[] args) {
        System.out.println("Alright, let's fill array");
        int[] yourArray = new int[3];
        System.out.println("Type first array integer: ");
        Scanner scanner = new Scanner(System.in);
        yourArray[0] = scanner.nextInt();
        System.out.println("Type second array integer: ");
        yourArray[1] = scanner.nextInt();
        System.out.println("Type third array integer: ");
        yourArray[2] = scanner.nextInt();
        System.out.println("Ok. Your array is: " + Arrays.toString(yourArray));
    }
}
