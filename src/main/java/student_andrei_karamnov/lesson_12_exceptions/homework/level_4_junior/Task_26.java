package student_andrei_karamnov.lesson_12_exceptions.homework.level_4_junior;

/*Напишите программу, которая вылетает с StackOverflowError.

Подсказка: Вызовите метод в рекурсии (сам себя).

Память JVM не безгранична!*/

public class Task_26 {
    public static void main(String[] args) {
        createRecursion(5);

    }

    public static int createRecursion(int number){
        return createRecursion(number);
    }

}
