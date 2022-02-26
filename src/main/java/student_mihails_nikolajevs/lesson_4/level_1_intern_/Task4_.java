package student_mihails_nikolajevs.lesson_4.level_1_intern_;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.

 */
public class Task4_ {

    public static void main(String[] args) {

        System.out.println("Please Enter Integer Number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("This number is even.");
        } else {
            System.out.println("This number is odd.");
        }

    }
}
