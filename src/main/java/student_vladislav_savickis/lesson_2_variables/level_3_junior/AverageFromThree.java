package student_vladislav_savickis.lesson_2_variables.level_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class AverageFromThree {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        double average;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = scanner.nextInt();
        System.out.println("Enter third number: ");
        thirdNumber = scanner.nextInt();

        average = ((double) firstNumber + (double) secondNumber + (double) thirdNumber) / 3;
        System.out.println("Average = " + average);
    }
}
