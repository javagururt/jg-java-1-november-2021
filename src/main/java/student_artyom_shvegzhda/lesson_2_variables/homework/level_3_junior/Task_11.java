package student_artyom_shvegzhda.lesson_2_variables.homework.level_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers to get average out of them:");
        Scanner scanner = new Scanner(System.in);

        double firstOne = scanner.nextDouble();
        double secondOne = scanner.nextDouble();
        double thirdOne = scanner.nextDouble();

        double averageOutOfThree = (firstOne + secondOne + thirdOne) / 3;

        System.out.println("Average of three numbers is: " + averageOutOfThree);
    }
}
