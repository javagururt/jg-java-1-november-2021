package student_stanislav_p.lesson_5_arrays_for_loop.homework.level_4_junior;

/*    Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
*/

import java.util.Random;
import java.util.Scanner;

public class Task_26 {

    public static void main(String[] args) {

        System.out.println("Please enter the array length ->");

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];


        for (int i=0;i<arrayLength;i++){
            numbers[i]=random.nextInt(100);

            System.out.println("The arrays number №"+(i+1) + " -> "+numbers[i]);
        }
    }
}
