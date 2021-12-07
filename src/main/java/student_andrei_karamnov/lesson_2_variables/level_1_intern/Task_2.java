package student_andrei_karamnov.lesson_2_variables.level_1_intern;
/*аписать консольную программу, которая запрашивает у пользователя два вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble();*/

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter two numbers and get calculations.");
    double firstDoubleNumber = scanner.nextDouble();
    double secondDoubleNumber = scanner.nextDouble();

    double sumResult = firstDoubleNumber + secondDoubleNumber;
    double subResult = firstDoubleNumber - secondDoubleNumber;
    double divideResult = firstDoubleNumber / secondDoubleNumber;
    double multiplyResult = firstDoubleNumber * secondDoubleNumber;

    System.out.println("Multiply:" + multiplyResult);
    System.out.println("Divide:" + divideResult);
    System.out.println("Sum:" + sumResult);
    System.out.println("Sub:" + subResult);
}
}
