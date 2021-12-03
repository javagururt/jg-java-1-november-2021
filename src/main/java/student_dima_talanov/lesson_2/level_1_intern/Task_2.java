package student_dima_talanov.lesson_2.level_1_intern;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first double number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second double number: ");
        double b = scanner.nextDouble();
        double result1;
        double result2;
        double result3;
        double result4;
        result1 = (a + b);
        result2 = (a - b);
        result3 = (a * b);
        result4 = (a / b);
        System.out.println("сложение " + result1);
        System.out.println("вычитания " + result2);
        System.out.println("умножения " + result3);
        System.out.println("деления " + result4);
    }
}
