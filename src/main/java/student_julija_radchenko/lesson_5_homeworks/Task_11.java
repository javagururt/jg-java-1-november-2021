package student_julija_radchenko.lesson_5_homeworks;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter whole number:");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        int[] numbers = {firstNumber, secondNumber, thirdNumber};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            System.out.println(number);
        }
    }
}
