package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_4_junior;
/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */
import java.util.Arrays;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_25 {
    public static void main(String[] args) {
        System.out.println("Alright, let's create an array.");
        System.out.println("Your array length will be: ");
        Scanner scanner = new Scanner(System.in);
        int[] yourArray = new int[scanner.nextInt()];
        for (int i = 0; i < yourArray.length; i++) {
            System.out.println("Type " +  (i + 1) + " array integer: ");
            yourArray[i] = scanner.nextInt();
        }
        System.out.println("Ok. Your array is: " + Arrays.toString(yourArray));
    }
}
