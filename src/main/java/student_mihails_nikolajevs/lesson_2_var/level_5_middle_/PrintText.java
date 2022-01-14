package student_mihails_nikolajevs.lesson_2_var.level_5_middle_;

import teacher.annotations.CodeReview;

/*
Команда System.out.println("text"); выводит указанный "text"
на консоль, и переводит курсор на новую строку.

Для того, что бы выводить текст на консоль без перевода курсора на
новую строку можно воспользоваться командой
    System.out.print("text");
эта команда распечатает текст на консоль и оставит курсор в той же строке.

Напишите программу, которая демонстрирует использование команды
    System.out.print("text");
 */
@CodeReview(approved = true)
public class PrintText {

    public static void main(String[] args) {
        System.out.print("text");

    }


}
