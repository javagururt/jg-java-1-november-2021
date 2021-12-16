/*Написать консольную программу, которая запрашивает у пользователя два вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble(); */
package student_jurij_mardusevic.lesson_2_variables.homework.level_1_intern.Task_2;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Calculating1{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("write the FIRST number and press ENTER");
        double firstNumber = 15;

        System.out.println("write the SECOND number and press ENTER");
        double secondNumber = 5;

        double Addition = firstNumber + secondNumber;
        double Subtraction = firstNumber - secondNumber;
        double Multiplication = firstNumber * secondNumber;
        double Division = firstNumber / secondNumber;

        System.out.println("Addition = " + Addition);
        System.out.println("Subtraction = " + Subtraction);
        System.out.println("Multiplication = " + Multiplication);
        System.out.println("Division = " + Division);
    }
}
