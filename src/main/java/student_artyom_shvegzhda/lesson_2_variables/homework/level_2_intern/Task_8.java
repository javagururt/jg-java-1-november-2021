package student_artyom_shvegzhda.lesson_2_variables.homework.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.next();
        System.out.println("Hello, your name is " + userName);

    }
}
