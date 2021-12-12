package student_dmitrijs_sinkevics.lesson_2.lvl_2;
import java.util.Scanner;
/*
Написать консольную программу, которая запрашивает
        имя пользователя и выводит на консоль текст:
        Hello имя пользователя!

 */
public class Task8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите имя пользователя");
        String a = keyboard.nextLine();
        System.out.print("Hello " + a + "!");
    }
}
