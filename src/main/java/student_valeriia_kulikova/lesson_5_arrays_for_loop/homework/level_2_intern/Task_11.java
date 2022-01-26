package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Arrays;
import java.util.Scanner;

public class Task_11 {
    /*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива числом, запрошенным у пользователя,
 - выведите значение каждой ячейки на консоль.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] number = new int[3];
        System.out.println("Enter FIRST number, please: ");
        number [0] = scanner.nextInt();
        System.out.println("Enter SECOND number, please: ");
        number [1] = scanner.nextInt();
        System.out.println("Enter THIRD number, please: ");
        number [2] = scanner.nextInt();
        System.out.println("Number 1: " + number [0] + "; Number 2: " + number [1] + "; Number 3: " + number [2] + "." );
        /*or*/
        System.out.println("Numbers:" + Arrays.toString(number));
    }
}
