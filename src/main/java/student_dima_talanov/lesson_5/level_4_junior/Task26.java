//Напишите программу, в которой:
//- запросите у пользователя с консоли длину массива
//- создайте массив указанной пользователем длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива.

package student_dima_talanov.lesson_5.level_4_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter my array length: ");
        int arrayLength = scanner.nextInt();

        System.out.println("Array number is: ");
        int [] myArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            myArray[i] = (int) (Math.random() * 30);
            System.out.println(myArray[i]);
        }
    }
}
