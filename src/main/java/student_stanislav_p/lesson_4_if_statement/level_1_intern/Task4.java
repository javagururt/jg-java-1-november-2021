package student_stanislav_p.lesson_4_if_statement.level_1_intern;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.
 */

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число :");

        int number = scanner.nextInt();

        if ( number % 2 == 0){
            System.out.println("Четное");
        }
        else {
            System.out.println("Нечетное");
        }

    }
}
