package student_dmitrijs_sinkevics;
import java.util.Scanner;
public class Lesson2_Lvl3_Task11 {
    public static void main(String[] args) {
        /*Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом.
*/
        System.out.println("введите 3 целых числа");
        Scanner keyboard = new Scanner(System.in);
        int a=keyboard.nextInt();
        int b=keyboard.nextInt();
        int c=keyboard.nextInt();
        double d=1.0*(a+b+c)/3;
        System.out.print(d);
    }
}
