package student_valeriia_kulikova.lesson_4_if_statement.homework.level_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, write the FIRST number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please, write the SECOND number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please, write the THIRD number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            System.out.println("All numbers are different");
        } else if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
