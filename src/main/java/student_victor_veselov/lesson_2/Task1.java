package student_victor_veselov.lesson_2;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task1 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите первое число : ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число : ");
                int b = scanner.nextInt();

                int sum = a + b;
                int raz = a - b;
                int umn = a * b;
                int del = a / b;

                System.out.print("Сложение : " + sum);
                System.out.println();
                System.out.print("Вычитание : " + raz);
                System.out.println();
                System.out.print("Умножение : " + umn);
                System.out.println();
                System.out.print("Деление : " + del);

        }
}
