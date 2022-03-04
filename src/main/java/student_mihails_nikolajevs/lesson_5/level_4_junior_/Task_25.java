package student_mihails_nikolajevs.lesson_5.level_4_junior_;
/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */
import java.util.Scanner;

public class Task_25 {

    public static void main(String[] args) {

        System.out.println(" Please Enter The Array Length : ");

        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();

        int[] number = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {

            System.out.println(" Please Enter The Whole Number " + (i + 1) + " : ");
            number[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayLength; i++) {
            System.out.println(" ARRAY ELEMENTS ARE NEXT " + (i + 1) + " -> " + number[i]);
        }
    }
}