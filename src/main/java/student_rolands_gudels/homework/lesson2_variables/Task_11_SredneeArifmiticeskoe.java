package Homework.lesson2_variables;

import java.util.Scanner;

public class Task_11_SredneeArifmiticeskoe {

    //Напишите программу, которая запрашивает у пользователя
    //три целых числа и выводит их среднее арифметическое
    //(складывает все числа и делит на их количество).
    //
    //Примечение: обратите внимание, что результат может быть дробным числом.
    public static void main(String[] args) {
        System.out.print("Please enter first integer number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.print("Please enter second integer number:");
        int secondNumber = scanner.nextInt();
        System.out.print("Please enter third integer number:");
        int thirdNumber = scanner.nextInt();
        double sumResult=(firstNumber+secondNumber+thirdNumber)/3;


        System.out.println("их среднее арифметическое:");
        System.out.println(sumResult);

    }
}
