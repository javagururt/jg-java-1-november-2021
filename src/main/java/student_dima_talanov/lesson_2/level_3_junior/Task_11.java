package student_dima_talanov.lesson_2.level_3_junior;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_11 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextFloat();
        double second = scanner.nextFloat();
        double third = scanner.nextFloat();
        double result = (first + second + third) / 3;
        System.out.println("Result is = " + result);
    }
}

