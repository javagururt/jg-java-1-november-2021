package student_mihails_nikolajevs.lesson_2_var.level_2_intern_;

import java.util.Scanner;

/*Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!

 */
public class HomeWorkVarTask8 {
    public static void main(String[] args) {
        System.out.println( " Please Enter Your Name ->");
        Scanner input = new Scanner(System.in);

        String name = input.next();
        System.out.println( " Hello " + name);

    }

}


