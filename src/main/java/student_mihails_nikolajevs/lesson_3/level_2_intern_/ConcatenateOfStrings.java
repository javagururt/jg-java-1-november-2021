package student_mihails_nikolajevs.lesson_3.level_2_intern_;
/*

Учимся работать со строками.

Тема: Конкатенация строк.

Напишите программу в которой создайте переменную
типа String и присвойте ей в качестве начального значения
ваше имя. Выведете на консоль приветствие типа "Hi YourName".

Подсказка: любые две строки можно соединять знаком "+".

    String userName = "Viktor";
    String greeting = "Hi " + userName + "!";
 */

public class ConcatenateOfStrings {

    public static void main(String[] args) {

        String userName = "Mihails";
        String greeting = "Hi " + userName + "!";

        System.out.println(greeting);
    }


}
