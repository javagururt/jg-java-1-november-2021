package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_4_junior;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.*/
public class Task_26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of array: ");
        int arrayLenght = scanner.nextInt();
        int[] numbers = new int[arrayLenght];

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = random.nextInt(50);
        }
        System.out.println("Numbers: " + Arrays.toString(numbers));
    }
}
