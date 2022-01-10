package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Arrays;
import java.util.Scanner;

import teacher.annotations.CodeReview;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 */
@CodeReview(approved = true)
class Task_26 {
    public static void main(String[] args) {
        System.out.println("Alright, let's create an array.");
        System.out.println("Your array length will be: ");
        Scanner scanner = new Scanner(System.in);
        int[] yourArray = new int[scanner.nextInt()];
        for (int i = 0; i < yourArray.length; i++) {
            yourArray[i] = (int)(Math.random()*100);
        }
        System.out.println("Ok. Your random array is: " + Arrays.toString(yourArray));
    }
}
