package student_dima_talanov.lesson_2.level_1_intern;
import java.util.Scanner;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Лучше объявлять переменные и сразу присваивать значения.")
public class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first whole number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second whole number: ");
        int b = scanner.nextInt();
        int result1;
        int result2;
        int result3;
        int result4;
        result1 = (a + b); // - скобки лишнее
        result2 = (a - b);
        result3 = (a * b);
        result4 = (a / b);
        System.out.println("сложение " + result1);
        System.out.println("вычитания " + result2);
        System.out.println("умножения " + result3);
        System.out.println("деления " + result4);
    }
}
