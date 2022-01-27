package student_vladislav_savickis.lesson_2_variables.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class HelloName {
    public static void main(String[] args) {
        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
