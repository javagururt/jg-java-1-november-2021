package student_rolands_gudels.homework.lesson2_variables.level_2;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_8_HelloName {
    //Написать консольную программу, которая запрашивает
    //имя пользователя и выводит на консоль текст:
    //Hello имя пользователя!
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!" );

    }
}
