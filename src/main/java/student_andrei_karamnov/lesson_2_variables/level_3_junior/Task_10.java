package student_andrei_karamnov.lesson_2_variables.level_3_junior;

import java.util.Scanner;

/*Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/
public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        final double pi = 3.141592653589793;
        double P = 2.0 * pi * r;
        double S = pi * Math.pow(r, 2);
        System.out.println("Perimeter of a circle: " + P);
        System.out.println("Area of a circle: " + S);


    }
}
