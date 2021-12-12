package student_eduards_puzirevskis.lesson_2_variables.level_2_intern;

import java.util.Scanner;

/*
Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!
 */
public class Acquaintance {
    public static void main(String[] args) {
        System.out.println("Hello there! Who are you?");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Nice to meet you, " + name );
        System.out.println("My name is Java");
    }

}
