package student_eduards_puzirevskis.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.
 */
 class Task_1 {
    public static void main(String[] args) {
        System.out.println("Hi! Let's check something...");
        while (true) {

            System.out.println("Please, enter any integer.");
            System.out.println("If you wanna exit, just type \"0\".");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            if (userNumber < 0) {
                System.out.println("Your number (" + userNumber + ") is negative");
            } else if (userNumber > 0) {
                System.out.println("Your number " + userNumber + " is positive");
            } else if (userNumber == 0) {
                System.out.println("OK, see you later!)");
                break;
            }
        }
    }

}
