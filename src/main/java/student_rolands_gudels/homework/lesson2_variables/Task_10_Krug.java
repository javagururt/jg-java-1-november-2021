package Homework.lesson2_variables;

import java.util.Scanner;

public class Task_10_Krug {
    //Напишите программу, которая запрашивает у пользователя
    //радиус круга (вещественное число) и печатает на консоль
    //периметр и площадь круга.
    //7,5
    //Test Data:
    //Radius = 7.5
    //
    //Expected Output
    //Perimeter is = 47.12388980384689
    //Area is = 176.71458676442586

    public static void main(String[] args) {
        System.out.println("Please enter circle radius(doube)");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double radiusKruga = (Math.PI*(2*radius));
        double S = (Math.PI*(radius*radius));
        System.out.println("Perimeter is = "+radiusKruga);
        System.out.println("Area is = "+S);
    }
}
