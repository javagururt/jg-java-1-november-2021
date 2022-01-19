package student_victor_veselov.lesson_5.intern_2;

import java.util.Arrays;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        System.out.println("Enter the numbers");
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Numbers are; " + Arrays.toString(numbers));
    }
}
