package student_valeriia_kulikova.lesson_4_if_statement.homework.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, write the FIRST number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please, write the SECOND number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println(firstNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println(secondNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println("Please, write the Second number, which will be greater or less than the FIRST number");
        }
    }
}
