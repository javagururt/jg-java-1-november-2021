package student_rolands_gudels.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Random;
import java.util.Scanner;

 class Task_26 {
    public static void main(String[] args) {
/*    Напишите программу, в которой:
            - запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.*/
        System.out.println("Please enter array length: ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        random.nextInt();
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i=0;i<numbers.length;i++){
            numbers[i]=random.nextInt(10);
            System.out.println(numbers[i]);
        }
    }
}
