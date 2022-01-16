package student_mihails_nikolajevs.lesson_3.level_2_intern_;
/*

Учимся работать со строками.

Тема: Считывание строк с консоли.

Программа должна спрашивать как зовут пользователя,
считывать его имя с консоли и выводить приветствие
в виде: "Hello UserName!".

Подсказка: строку с консоли можно считать используя
обьект Scanner. Загуглите как это можно сделать:
"как в Java считать строку с консоли".
 */

import java.util.Scanner;
public class ReadingStringsFromConsole {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Your Name -> ");
        String Name = in.next();

        System.out.println("Hello " + Name + "!");
        in.close();
    }
}
