package student_andrei_karamnov.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива числом, запрошенным у пользователя,
 - выведите значение каждой ячейки на консоль.*/
@CodeReview(approved = true)
class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[3];
            System.out.println("Insert array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
            System.out.print ("Inserted array elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print (" " + array[i]);
        }
    }
    }

