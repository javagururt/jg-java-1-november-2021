package student_andrei_karamnov.lesson_3_oop_first_look.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

/*Учимся работать со строками.

Тема: Считывание строк с консоли.

Программа должна спрашивать как зовут пользователя,
считывать его имя с консоли и выводить приветствие
в виде: "Hello UserName!".

Подсказка: строку с консоли можно считать используя
обьект Scanner. Загуглите как это можно сделать:
"как в Java считать строку с консоли".*/
@CodeReview(approved = true)
class Task_9 {
    public static void main(String[] args) {
        String question = "What is your user name?";
        System.out.println(question);

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }

}
