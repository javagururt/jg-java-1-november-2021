package student_victor_veselov.lesson_2;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
