package student_andrei_karamnov.lesson_4_if_statement.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_5 {
    public static void main(String[] args) {
        System.out.println("Please enter two integers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > y){
            System.out.println(x);
        }
        else if (x < y){
            System.out.println(y);
        }
    }
}
