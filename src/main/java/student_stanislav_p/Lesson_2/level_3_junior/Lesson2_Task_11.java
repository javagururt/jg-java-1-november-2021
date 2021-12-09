package student_stanislav_p.Lesson_2.level_3_junior;

/*
Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом.
 */
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Lesson2_Task_11 {

        public static void main(String [] args) {

           double SredneeA;

            Scanner scanner = new Scanner(System.in);


            System.out.println("Введите первое целое число ->");

            int Num1 = scanner.nextInt();

            System.out.println("Введите второе целое число ->");

            int Num2 = scanner.nextInt();

            System.out.println("Введите третье целое число ->");

            int Num3 = scanner.nextInt();


            SredneeA = (Num1 + Num2 + Num3) / 3;

            System.out.println("Среднее арифмитическое  = " + SredneeA);

        }

}
