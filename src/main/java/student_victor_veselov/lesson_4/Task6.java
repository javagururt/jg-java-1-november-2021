package student_victor_veselov.lesson_4;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int a = scanner.nextInt();
        System.out.println("Enter the second number :");
        int b = scanner.nextInt();


        if ( a < b ){
            System.out.println("The first number smallest = " + a);
        } else {
            System.out.println("The second number smallest = " + b);
        }
    }

}
