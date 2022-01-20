package student_vladislav_savickis.lesson_2_variables.level_1_intern;

import java.util.Scanner;

class SumSubMulDivInt {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = scanner.nextInt();

        System.out.println("Sum = " + (firstNumber + secondNumber));
        System.out.println("Sub = " + (firstNumber - secondNumber));
        System.out.println("Mul = " + (firstNumber * secondNumber));
        System.out.println("Div = " + (firstNumber / secondNumber));
    }
}
