/*Написать консольную программу, которая запрашивает у пользователя два вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble(); */
package student_jurij_mardusevic.lesson_2;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Lesson2_Task2{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("write the FIRST number and press ENTER");
        double firstNumber = 15;

        System.out.println("write the SECOND number and press ENTER");
        double secondNumber = 5;

        double Сложение = firstNumber + secondNumber;
        double Вычитание = firstNumber - secondNumber;
        double Умножение = firstNumber * secondNumber;
        double Деление = firstNumber / secondNumber;

        System.out.println("Сложение = " + Сложение);
        System.out.println("Вычитание = " + Вычитание);
        System.out.println("Умножение = " + Умножение);
        System.out.println("Деление = " + Деление);
    }
}
