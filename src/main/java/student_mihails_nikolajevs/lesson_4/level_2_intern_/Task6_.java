package student_mihails_nikolajevs.lesson_4.level_2_intern_;
/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
 */

import java.util.Scanner;

public class Task6_ {

    public static void main(String[] args) {

        System.out.println("Please Enter Two Integer Numbers : ");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 < number2) {
            System.out.println("Your Integer First number: " + number1 + " -> Less Than The Second Number: " + number2);
            System.out.println(number1);
        }

       else if (number2 < number1) {
           System.out.println("Your Integer Second number: " + number2 + " -> Less Than The First Number: " + number1);
           System.out.println(number2);
        }

    }
}
