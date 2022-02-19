package student_artyom_shvegzhda.lesson_2_variables.homework.level_3_junior;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner multiplyBy = new Scanner(System.in);

        int scanner = multiplyBy.nextInt();

        for (int y = 1; y < 11; y++) {
            int multiplier = scanner * y;

            System.out.println(scanner + " x " + y + " = " + multiplier);

        }
    }
}
