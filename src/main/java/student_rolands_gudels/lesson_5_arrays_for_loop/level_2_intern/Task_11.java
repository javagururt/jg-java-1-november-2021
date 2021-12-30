package student_rolands_gudels.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Scanner;

public class Task_11 {
    /*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива числом, запрошенным у пользователя,
 - выведите значение каждой ячейки на консоль. */
    public static void main(String[] args) {
        System.out.println("Please enter three integer numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int[] numbers = {x,y,z};
        for (int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
