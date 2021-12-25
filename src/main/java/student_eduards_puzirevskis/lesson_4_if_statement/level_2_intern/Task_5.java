package student_eduards_puzirevskis.lesson_4_if_statement.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.
 */
@CodeReview(approved = true)
class Task_5 {
    public static void main(String[] args) {
        System.out.println("Hello! Let's choose two integer numbers and check, which of them is bigger");
        System.out.println("A = ");
        Scanner scanner = new Scanner(System.in);
        int userFirstNumber = scanner.nextInt();
        System.out.println("OK. Your number ir (" + userFirstNumber + "). Let's choose second one");
        System.out.println("B = ");
        int userSecondNumber = scanner.nextInt();
        System.out.println("Nice. Your second number ir (" + userFirstNumber + ").");
        if (userFirstNumber < userSecondNumber) {
            System.out.println(userFirstNumber + " < " + userSecondNumber);
        } else if (userFirstNumber > userSecondNumber){
            System.out.println(userFirstNumber + " > " + userSecondNumber);
        } else {
            System.out.println("Numbers are equals)");
        }
    }
}
