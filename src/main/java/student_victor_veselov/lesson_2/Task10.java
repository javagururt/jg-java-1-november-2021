package student_victor_veselov.lesson_2;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус ");
        double a = scanner.nextDouble();


        System.out.println("Периметр круга = " + 2 * 3.14 * a);
        System.out.println("Площадь круга = " + a * a * 3.14);


    }
}
