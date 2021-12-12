package student_stanislav_p.Lesson_2.level_1_intern;
/*
Написать консольную программу, которая запрашивает у пользователя два целых числа и
выводит на консоль результаты: сложения, вычитания, умножения и деления.

1. Создать класс с нужным именем;
2. Создать описать main метод;
3. Воспользуйтесь специальным классом Scanner и его методом nextInt() для получения ввода с клавиатуры
          Scanner scanner = new Scanner(System.in);
          int firstNumber = scanner.nextInt();
4. Запишите полученные результаты в переменные;
5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
  (каждый результат на новой строке отдельно).
 */
import java.util.Scanner;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "названия переменных должны начинаться с маленькой буквы" +
        "переменные лучше объявлять и сразу присваивать значение" +
        "Лучше следовать правилу 1 переменная - 1 строка. Не нужно объявлять все переменные в одной строке.")
public class Lesson2_Task_1 {

        public static void main(String [] args) {

            int Sum, Min, Mult, Div;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число ->");
            int Num1 = scanner.nextInt();

            System.out.println("Введите второе число (меньше первого) ->");
            int Num2 = scanner.nextInt();


            Sum = Num1 + Num2;
            Min = Num1 - Num2;
            Mult = Num1 * Num2;
            Div = Num1 / Num2;

            System.out.println(Num1 + " + " + Num2 + " = " + Sum);
            System.out.println(Num1 + " - " + Num2 + " = " + Min);
            System.out.println(Num1 + " * " + Num2 + " = " + Mult);
            System.out.println(Num1 + " / " + Num2 + " = " + Div);
        }

}
