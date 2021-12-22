package student_stanislav_p.lesson_4_if_statement.level_3_junior;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] arg) {

        Scanner num = new Scanner(System.in);

        System.out.println("Enter the number1 ->");

        int number1 = num.nextInt();

        System.out.println("Enter the number2 ->");

        int number2 = num.nextInt();

        System.out.println("Enter the number3 ->");

        int number3 = num.nextInt();

        if (number1 < number2 && number2 < number3) {
            System.out.println("Increasing");

        } else if  (number1 > number2 && number2 > number3) {
            System.out.println("Decreasing");

        } else {

           System.out.println("Neither increasing or decreasing order");
        }
    }
}

