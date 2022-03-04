package student_mihails_nikolajevs.lesson_5.level_4_junior_;
/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 */

import java.util.Scanner;
import java.util.Random;

public class Task_26 {

    public static void main(String[] args) {

        System.out.println(" Please Enter The Array Length : ");

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int arrayLength = scanner.nextInt();

        int[] number = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {

            number[i] = random.nextInt(50);

            System.out.println(" ARRAY ELEMENTS ARE NEXT " + (i + 1) + " -> " + number[i]);
        }
    }
}