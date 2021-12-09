package student_eduards_puzirevskis.lesson_2_variables.level_3_junior;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */
public class CircleCalculation {
    public static void main(String[] args) {
        double pi = 3.1415926536 ;
        System.out.println("Please, enter your circle radius : ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double perimeter = 2*pi*radius;
        double area = pi*radius*radius;

        System.out.println("Your circle Radius is : " + radius);
        System.out.println("Your circle Perimeter is : " + perimeter);
        System.out.println("Your circle Area is : " + area);

    }
}
