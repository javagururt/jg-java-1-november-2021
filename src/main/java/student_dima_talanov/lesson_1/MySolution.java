package student_dima_talanov.lesson_1;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class MySolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println("Температура воздуха сегодня:" + t + "градусов.");
    }
}

