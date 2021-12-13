package student_dmitrijs_sinkevics.lesson_2.lvl_1_intern;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        /*
        Написать консольную программу, которая запрашивает у пользователя два вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble();
         */
        System.out.println("введите 2 вещественных числа (числа с запятой)");
        Scanner keyboard = new Scanner(System.in);
        double a=keyboard.nextDouble();
        double b=keyboard.nextDouble();
        System.out.println("сложение: "+(a+b));
        System.out.println("вычитание: "+(a-b));
        System.out.println("умножение: "+(a*b));
        System.out.println("деление: "+(a/b));

    }
}
