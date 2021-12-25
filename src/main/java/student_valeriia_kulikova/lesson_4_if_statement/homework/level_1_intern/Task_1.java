package student_valeriia_kulikova.lesson_4_if_statement.homework.level_1_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number: ");
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println(x + " > 0");
        } else if (x < 0) {
            System.out.println(x + " < 0");
        }

    }
}
