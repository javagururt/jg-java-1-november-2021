package student_stanislav_p.lesson_5_arrays_for_loop.level_4_junior;

/*    Напишите программу, в которой:
            - запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
*/

import java.util.Scanner;

public class Task_25 {

    public static void main(String[] args) {

        System.out.println("Please enter the array length ->");

        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i=0;i<arrayLength;i++) {
            System.out.println("Please enter array integer number №"+ (i+1) + " -> ");
            numbers[i]=scanner.nextInt();
        }
        for (int i=0;i<arrayLength;i++){
            System.out.println("The arrays number №"+(i+1) + " -> "+numbers[i]);
        }
    }
}
