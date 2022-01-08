package student_mihails_nikolajevs.lesson_2_var.level_2_intern_;

/*Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!

 */


import java.util.Scanner;


public class EnterName {
    public static void main(String[] args) {
        System.out.println( " Please Enter Your Name ->");
        Scanner input = new Scanner(System.in);

        String name = input.next();
        System.out.println( " Hello " + name);

    }

}


