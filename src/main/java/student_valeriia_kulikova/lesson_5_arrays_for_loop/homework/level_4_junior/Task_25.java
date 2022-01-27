package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_4_junior;

import java.util.Arrays;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array: ");
        int arrayLenght = scanner.nextInt();
        int[] numbers = new int[arrayLenght];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number " + i + ":");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Numbers: " + Arrays.toString(numbers));
    }
}
