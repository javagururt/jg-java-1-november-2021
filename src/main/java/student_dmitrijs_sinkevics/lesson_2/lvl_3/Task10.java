package student_dmitrijs_sinkevics.lesson_2.lvl_3;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
       /* Напишите программу, которая запрашивает у пользователя
        радиус круга (вещественное число) и печатает на консоль
        периметр и площадь круга.

        Test Data:
        Radius = 7.5

        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586
        */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите радиус круга (вещественное число) ");
        double radius = keyboard.nextDouble();
        double pi=3.14159265358979;
        int c=2;
        double perimeter =radius*2*pi;
        double area=Math.pow(radius,c)*pi;
        System.out.println("Perimeter is ="+perimeter);
        System.out.println("Area is ="+area);
    }


}