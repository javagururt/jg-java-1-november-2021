package student_valeriia_kulikova.Lesson_2.level_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_11 {
    public static void main(String [] args) {

        double СрЗнач;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Число 1:");
        int Num1 = scanner.nextInt();

        System.out.println("Число 2:");
        int Num2 = scanner.nextInt();

        System.out.println("Число 3:");
        int Num3 = scanner.nextInt();

        СрЗнач = (Num1 + Num2 + Num3) / 3;

        System.out.println("Среднее арифмитическое  = " + СрЗнач);

    }

}
