package student_dmitrijs_sinkevics;
import java.util.Scanner;
public class Lesson2_Lvl1_Task1 {

    public static void main(String[] args) {
        /*
        Написать консольную программу, которая запрашивает у пользователя два целых числа и
выводит на консоль результаты: сложения, вычитания, умножения и деления.

1. Создать класс с нужным именем;
2. Создать описать main метод;
3. Воспользуйтесь специальным классом Scanner и его методом nextInt() для получения ввода с клавиатуры
          Scanner scanner = new Scanner(System.in);
          int firstNumber = scanner.nextInt();
4. Запишите полученные результаты в переменные;
5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
 (каждый результат на новой строке отдельно).
         */
        System.out.println("введите 2 целых числа");
        Scanner keyboard = new Scanner(System.in);
        int a=keyboard.nextInt();
        int b=keyboard.nextInt();
        System.out.println("сложение: "+(a+b));
        System.out.println("вычитание: "+(a-b));
        System.out.println("умножение: "+(a*b));
        System.out.println("деление: "+(a/b));
    }
}
