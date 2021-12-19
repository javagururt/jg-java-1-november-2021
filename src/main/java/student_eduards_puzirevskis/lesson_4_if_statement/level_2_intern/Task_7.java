package student_eduards_puzirevskis.lesson_4_if_statement.level_2_intern;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны
 */
class Task_7 {
    public static void main(String[] args) {
        System.out.println("Hi! Let's compare two integers and decide, are they equal or not");
        System.out.println("Please, type first number:");
        Scanner scanner = new Scanner(System.in);
        int userFirstNumber = scanner.nextInt();
        System.out.println("Please, type second number:");
        int userSecondNumber = scanner.nextInt();
        System.out.println("OK. Let me check...");
        if (userFirstNumber == userSecondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
