package student_rolands_gudels.lesson4_if_statement.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Task_5 {
    /*Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else. */
    public static void main(String[] args) {
        System.out.println("Please enter two integer numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x>y) {
            System.out.println("First entered number is bigger " + x);
        } else if  (x==y) {
            System.out.println("Sorry but first and second numbers are the same");
        } else {
            System.out.println("Second entered number is bigger " + y);
        }
    }
}
