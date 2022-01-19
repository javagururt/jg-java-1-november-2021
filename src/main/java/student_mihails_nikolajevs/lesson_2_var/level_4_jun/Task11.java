package student_mihails_nikolajevs.lesson_2_var.level_4_jun;

import teacher.annotations.CodeReview;

/*
Write a Java program to print the sum of two numbers.

Test Data:
74 + 36
Expected Output :
110
 */
@CodeReview(approved = true)
public class Task11 {

    public static void main(String[] args) {

        int a = 74;
        int b = 36;
        int c = a + b;

        System.out.println( "Test Data: ");
        System.out.println( "74 + 36" );
        System.out.println("Expected Output : ");
        System.out.println(c);
    }
}