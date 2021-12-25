package student_rolands_gudels.lesson4_if_statement.level_1_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_1 {

    /*Написать программу, которая запрашивает у
    пользователя
    целое число и выводит на консоль
    положительное оно или отрицательное. */
    public static void main(String[] args) {
        System.out.println("Please enter integer number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x >= 0) {
            System.out.println("You entered positive number");
        } else {
            System.out.println("You entered negative number");
        }
    }
}
