package student_victor_veselov.lesson_2;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число ");
        double b = scanner.nextDouble();
        System.out.println("Введите третье число ");
        double c = scanner.nextDouble();

        System.out.println("Среднее арифметическое = " + (a+b+c)/3);
    }
}
