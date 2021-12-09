package student_dmitrijs_sinkevics;
import java.util.Scanner;

import teacher.annotations.CodeReview;

/*
Написать консольную программу, которая запрашивает
        имя пользователя и выводит на консоль текст:
        Hello имя пользователя!

 */
@CodeReview(approved = true)
public class Lesson2_Lvl2_Task8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите имя пользователя");
        String a = keyboard.nextLine();
        System.out.print("Hello " + a + "!");
    }
}
