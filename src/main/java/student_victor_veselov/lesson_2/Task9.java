package student_victor_veselov.lesson_2;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int a = scanner.nextInt();

        for (int i = 1; i < 11 ; i++){
            System.out.println(a + " x " + i + " = " + i * a);
        }
    }
}
