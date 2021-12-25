package student_eduards_puzirevskis.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.
 */
@CodeReview(approved = true)
class Task_4 {
    public static void main(String[] args) {
        System.out.println("Let's check something III");
        System.out.println("Enter any integer and I'll tell you: is it even or odd.");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        if (userNumber == 0){
            System.out.println("Let's try another one. It's too tricky moment)");
        } else if (userNumber % 2 == 1) {
            System.out.println("Your number (" + userNumber + ") is odd");
        } else if (userNumber % 2 != 1) {
            System.out.println("Your number (" + userNumber + ") is even");
        } else {
            System.out.println("What have you done? ");
        }

    }
}
