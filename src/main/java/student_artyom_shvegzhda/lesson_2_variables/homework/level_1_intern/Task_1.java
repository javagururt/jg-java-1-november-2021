package student_artyom_shvegzhda.lesson_2_variables.homework.level_1_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to get simple math operations with them:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int multiplyBy = firstNumber * secondNumber;
        int concatenateBy = firstNumber + secondNumber;
        int divideBy = firstNumber / secondNumber;
        int subtractedBy = firstNumber - secondNumber;

        System.out.println("Multiply is: " + multiplyBy);
        System.out.println("Sum is: " + concatenateBy);
        System.out.println("Divide is: " + divideBy);
        System.out.println("Subtraction is: " + subtractedBy);
    }
}
