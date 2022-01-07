package student_jurij_mardusevic.lesson_5_arrays_for_loop.homework.level_2_intern.Task_11;

import java.util.Arrays;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class IntegerInput {
    public static void main(String[] args) {
        System.out.println("Заполним массив целыми числами");
        int[] yourArray = new int[3];
        System.out.println("Введите первое целое число массива: ");
        Scanner scanner = new Scanner(System.in);
        yourArray[0] = scanner.nextInt();
        System.out.println("Введите второе целое число массива: ");
        yourArray[1] = scanner.nextInt();
        System.out.println("Введите третье целое число массива: ");
        yourArray[2] = scanner.nextInt();
        System.out.println("Целые числа вашего массива: " + Arrays.toString(yourArray));

    }
}
