package student_rolands_gudels.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {

/*    Напишите программу, в которой:
            - запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.*/
        System.out.println("Please enter the array length:");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
                int[] numbers = new int[length];
                for (int j=0;j<length;j++) {
                    System.out.println("Please enter array integer number");
                    numbers[j]=scanner.nextInt();
                }
        for (int j=0;j<length;j++){
            System.out.println("The arrays number is: "+numbers[j]);
        }




    }
}