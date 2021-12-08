/*Написать консольную программу, которая запрашивает у пользователя два целых числа и
        выводит на консоль результаты: сложения, вычитания, умножения и деления.

        1. Создать класс с нужным именем;
        2. Создать описать main метод;
        3. Воспользуйтесь специальным классом Scanner и его методом nextInt() для получения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        4. Запишите полученные результаты в переменные;
        5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
        (каждый результат на новой строке отдельно).**/

package student_jurij_mardusevic.lesson_2;

import java.util.Scanner;

public class Lesson2_Task1{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("write the FIRST number and press ENTER");
        int firstNumber = 15;

        System.out.println("write the SECOND number and press ENTER");
        int secondNumber = 5;

        int Сложение = firstNumber + secondNumber;
        int Вычитание = firstNumber - secondNumber;
        int Умножение = firstNumber * secondNumber;
        int Деление = firstNumber / secondNumber;

        System.out.println("Сложение = " + Сложение);
        System.out.println("Вычитание = " + Вычитание);
        System.out.println("Умножение = " + Умножение);
        System.out.println("Деление = " + Деление);

    }
}
