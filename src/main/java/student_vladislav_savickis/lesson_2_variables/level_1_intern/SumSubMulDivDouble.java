package student_vladislav_savickis.lesson_2_variables.level_1_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class SumSubMulDivDouble {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNumber = scanner.nextDouble();
        System.out.println("Enter second number: ");
        secondNumber = scanner.nextDouble();

        System.out.println("Sum = " + (firstNumber + secondNumber));
        System.out.println("Sub = " + (firstNumber - secondNumber));
        System.out.println("Mul = " + (firstNumber * secondNumber));
        System.out.println("Div = " + (firstNumber / secondNumber));
    }
}
