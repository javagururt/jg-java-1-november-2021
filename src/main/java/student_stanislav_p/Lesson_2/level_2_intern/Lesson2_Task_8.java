package student_stanislav_p.Lesson_2.level_2_intern;
/*
Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!

 */
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Lesson2_Task_8 {

    public static void main(String [] args) {

    Scanner in = new Scanner(System.in);
         System.out.print("Введите ваше имя ->");
    String name1 = in.nextLine();


        System.out.println("Hello " + name1);
    }

}