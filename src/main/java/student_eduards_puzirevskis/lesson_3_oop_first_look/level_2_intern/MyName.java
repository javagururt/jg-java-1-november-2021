package student_eduards_puzirevskis.lesson_3_oop_first_look.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

/*
Учимся работать со строками.

Тема: создание переменной типа String.

Напишите программу в которой создайте переменную
типа String и присвойте ей в качестве начального значения
ваше имя. Выведете на консоль значение этой переменной.

Пример кода:

    String myName = "Viktor";
    System.out.println(myName);

 */
@CodeReview(approved = true)
public class MyName {
    public static void main(String[] args) {
        String myName = "Eduards";
        System.out.println(myName);

        String greetings = "Hi! My name is " + myName + "!";
        System.out.println(greetings);

        System.out.println("What's yor name?");

        Scanner scanner = new Scanner(System.in);
        String guestName = scanner.nextLine();
        System.out.println("Hello, " + guestName + ". Nice to meet you!");

    }
}
