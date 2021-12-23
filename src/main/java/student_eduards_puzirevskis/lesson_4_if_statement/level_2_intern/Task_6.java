package student_eduards_puzirevskis.lesson_4_if_statement.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
 */
@CodeReview(approved = true)
class Task_6 {
    public static void main(String[] args) {
        System.out.println("Hi! Let's compare two  integers.");
        System.out.println("Please, type first number:");
        Scanner scanner = new Scanner(System.in);
        int userFirstNumber = scanner.nextInt();
        System.out.println("Please, type second number:");
        int userSecondNumber = scanner.nextInt();
        System.out.println("OK. Let me check...");
        if (userFirstNumber < userSecondNumber) {
            System.out.println("OK. The biggest of them is " + userSecondNumber);
        } else if (userFirstNumber > userSecondNumber){
            System.out.println("OK. The biggest of them is " + userFirstNumber);
        } else {
            System.out.println("Numbers are equals)");
        }

    }
}
