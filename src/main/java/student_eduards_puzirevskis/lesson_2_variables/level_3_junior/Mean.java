package student_eduards_puzirevskis.lesson_2_variables.level_3_junior;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом.
 */
public class Mean {
    public static void main(String[] args) {
        System.out.println("Please, enter Firsth number :");
        Scanner scanner = new Scanner(System.in);
        double firsthNumber = scanner.nextDouble();
        System.out.println("Please, enter Second number :");
        double secondNumber = scanner.nextDouble();
        System.out.println("Please, enter Third number :");
        double thirdhNumber = scanner.nextDouble();

        double mean = (firsthNumber + secondNumber + thirdhNumber)/3;

        System.out.println("Mean of your numbers is : " + mean);

    }
}
