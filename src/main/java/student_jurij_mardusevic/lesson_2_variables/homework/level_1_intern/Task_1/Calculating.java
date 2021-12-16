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

package student_jurij_mardusevic.lesson_2_variables.homework.level_1_intern.Task_1;

import java.util.Scanner;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "scanner не используется. Названия переменной должно начинать с маленькой буквы." +
        " Используйте латинские буквы и английские названия.")
public class Calculating {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("write the FIRST number and press ENTER");
        int firstNumber = 15;

        System.out.println("write the SECOND number and press ENTER");
        int secondNumber = 5;

        int Addition = firstNumber + secondNumber;
        int Subtraction = firstNumber - secondNumber;
        int Multiplication = firstNumber * secondNumber;
        int Division = firstNumber / secondNumber;

        System.out.println("Addition = " + Addition);
        System.out.println("Subtraction = " + Subtraction);
        System.out.println("Multiplication = " + Multiplication);
        System.out.println("Division = " + Division);

    }
}
