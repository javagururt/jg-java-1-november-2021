/*Команда System.out.println("text"); выводит указанный "text"
на консоль, и переводит курсор на новую строку.

Для того, что бы выводить текст на консоль без перевода курсора на
новую строку можно воспользоваться командой
    System.out.print("text");
эта команда распечатает текст на консоль и оставит курсор в той же строке.

Напишите программу, которая демонстрирует использование команды
    System.out.print("text"); */

package student_jurij_mardusevic.lesson_2_variables.homework.level_5_middle.Task_15;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Lesson2_Task15 {
    public static void main(String[] args) {
        System.out.print("text");
    }
}
