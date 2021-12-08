package student_rolands_gudels.homework.lesson2_variables.level_1;

import java.util.Scanner;

public class Task_2_UserInputDouble {
    //Написать консольную программу, которая запрашивает у пользователя два вещественных числа
    //(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
    //Вещественные числа можно запрашивать с консоли используя обьект Scanner
    //следующим образом:
    //
    //    Scanner scanner = new Scanner(System.in);
    //    double firstDoubleNumber = scanner.nextDouble();

    public static void main(String[] args) {
        System.out.print("Please enter first double number:");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        System.out.print("Please enter second double number:");
        double secondNumber = scanner.nextDouble();
        double sumResult=firstNumber+secondNumber;
        double substractionResult=firstNumber-secondNumber;
        double multiplicationResult=firstNumber*secondNumber;
        double divisionResult=firstNumber/secondNumber;

        System.out.println("Сложение этих двух чисел:");
        System.out.println(sumResult);
        System.out.println("Вычитание этих двух чисел:");
        System.out.println(substractionResult);
        System.out.println("Умножение этих двух чисел:");
        System.out.println(multiplicationResult);
        System.out.println("Деление этих двух чисел:");
        System.out.println(divisionResult);
    }
}
