//Напишите программу, в которой:
//- запросите у пользователя с консоли длину массива
//- создайте массив указанной пользователем длины
//- заполните массив числами полученными от пользователя
//- распечатайте на консоль все элементы массива.

package student_dima_talanov.lesson_5.level_4_junior;

import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter my array length: ");
        int arrayLength = scanner.nextInt();

        int myArray[] = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Array number is: ");
            myArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Array elements is: " + myArray[i]);
        }
    }
}
