package student_andrei_karamnov.lesson_3_oop_first_look.level_2_intern;
/*Учимся работать со строками.

Тема: Конкатенация строк.

Напишите программу в которой создайте переменную
типа String и присвойте ей в качестве начального значения
ваше имя. Выведете на консоль приветствие типа "Hi YourName".

Подсказка: любые две строки можно соединять знаком "+".

    String userName = "Viktor";
    String greeting = "Hi " + userName + "!";*/
public class Task_8 {
    public static void main(String[] args) {
        String userNAme = "Andrei";
        String greeting = "Hi " + userNAme + "!";
        System.out.println(greeting);
    }
}
