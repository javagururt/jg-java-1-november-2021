package student_victor_veselov.lesson_4;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = scanner.nextInt();

        if ( a % 2 == 0){
            System.out.println("Четное");
        }else {
            System.out.println("Нечетное");
        }

    }
}
