package student_eduards_puzirevskis.lesson_2_variables.level_1_intern;

import java.util.Scanner;

/*
Написать консольную программу, которая запрашивает у пользователя два вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble();
 */
public class MathActionsWithDoubleNumber {

    public static void main(String[] args) {
        System.out.println("Simple math actions by double numbers ");

        Scanner scan = new Scanner(System.in);

        System.out.print("Please, enter first double number here : ");
        double firsthDoubleNumber = scan.nextDouble();
        System.out.print("Please, enter second double number here : ");
        double secondDoubleNumber = scan.nextDouble();

        double sum = firsthDoubleNumber + secondDoubleNumber;
        double subtraction = firsthDoubleNumber - secondDoubleNumber;
        double reverseSubtraction = secondDoubleNumber - firsthDoubleNumber;
        double multiply = firsthDoubleNumber * secondDoubleNumber;
        double division = firsthDoubleNumber / secondDoubleNumber;
        double reverseDivision = secondDoubleNumber / firsthDoubleNumber;

        System.out.println(" Your results : ");
        System.out.println("A + B = " + sum );
        System.out.println("A - B = " + subtraction);
        System.out.println("B - A = " + reverseSubtraction);
        System.out.println("A * B = " + multiply);
        System.out.println("A / B = " + division);
        System.out.println("B / A = " + reverseDivision);




    }
}
