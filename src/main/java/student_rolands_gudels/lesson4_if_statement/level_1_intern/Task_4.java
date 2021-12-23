package student_rolands_gudels.lesson4_if_statement.level_1_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_4 {

    /*Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.  */
    public static void main(String[] args) {
        System.out.println("Please enter integer number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x%2 == 0) {
            System.out.println("You entered even number");
        } else {
            System.out.println("You entered not even number");
        }
    }
}
