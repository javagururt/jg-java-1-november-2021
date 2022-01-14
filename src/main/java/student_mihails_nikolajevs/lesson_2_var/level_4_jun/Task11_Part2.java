package student_mihails_nikolajevs.lesson_2_var.level_4_jun;

import teacher.annotations.CodeReview;

/*
Write a Java program to divide two numbers and print on the screen.
Test Data :
50/3
Expected Output :
16
 */
@CodeReview(approved = true)
public class Task11_Part2 {

    public static void main(String[] args) {

        int a = 50;
        int b = 3;
        int c = a / b;

        System.out.println("Test Data : ");
        System.out.println("50/3 ");
        System.out.println( "Expected Output : ");
        System.out.println(c);
    }
}
