package student_victor_veselov.lesson_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число : ");
        double b = scanner.nextDouble();

        double sum = a + b;
        double raz = a - b;
        double umn = a * b;
        double del = a / b;

        System.out.print("Сложение : " + sum);
        System.out.println();
        System.out.print("Вычитание : " + raz);
        System.out.println();
        System.out.print("Умножение : " + umn);
        System.out.println();
        System.out.print("Деление : " + del);
    }
}
