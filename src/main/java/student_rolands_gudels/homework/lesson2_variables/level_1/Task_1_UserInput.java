package student_rolands_gudels.homework.lesson2_variables.level_1;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_1_UserInput {
    //Написать консольную программу, которая запрашивает у пользователя два целых числа и
    //выводит на консоль результаты: сложения, вычитания, умножения и деления.
    //
    //1. Создать класс с нужным именем;
    //2. Создать описать main метод;
    //3. Воспользуйтесь специальным классом Scanner и его методом nextInt() для получения ввода с клавиатуры
    //          Scanner scanner = new Scanner(System.in);
    //          int firstNumber = scanner.nextInt();
    //4. Запишите полученные результаты в переменные;
    //5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
    // (каждый результат на новой строке отдельно).
    public static void main(String[] args) {
        System.out.print("Please enter first integer number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.print("Please enter second integer number:");
        int secondNumber = scanner.nextInt();
        int sumResult=firstNumber+secondNumber;
        int substractionResult=firstNumber-secondNumber;
        int multiplicationResult=firstNumber*secondNumber;
        int divisionResult=firstNumber/secondNumber;

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
