package student_andrei_karamnov.lesson_2_variables.level_2_intern;

/*Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!*/

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        System.out.println("Please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
