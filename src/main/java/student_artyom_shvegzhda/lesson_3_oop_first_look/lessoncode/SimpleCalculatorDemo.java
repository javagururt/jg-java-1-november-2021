package student_artyom_shvegzhda.lesson_3_oop_first_look.lessoncode;

import teacher.lesson_3_oop_first_look.lessoncode.SimpleCalculator;

import java.util.Scanner;

class SimpleCalculatorDemo {

    public static void main(String[] args) {
        teacher.lesson_3_oop_first_look.lessoncode.SimpleCalculator calculator = new SimpleCalculator();

        int sumResult = calculator.sum(3, 5);
        calculator.printSum(sumResult);

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = userInput.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = userInput.nextInt();

        int userSumResult = calculator.sum(firstNumber, secondNumber);
        calculator.printSum(userSumResult);
    }
}
