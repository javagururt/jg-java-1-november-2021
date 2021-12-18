package student_valeriia_kulikova.Lesson_3.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("write your name: ");

        String userName = scanner.nextLine();

        String greeting = "Hi, " + userName + "!";
        System.out.println(greeting);

    }
}
