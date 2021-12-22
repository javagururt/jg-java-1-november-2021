package student_stanislav_p.lesson_4_if_statement.level_3_junior;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args){

        Scanner num = new Scanner(System.in);

        System.out.println("Enter the number1 ->");
        int number1 = num.nextInt();

        System.out.println("Enter the number2 ->");
        int number2 = num.nextInt();

        System.out.println("Enter the number3 ->");
        int number3 = num.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("The largest number is number1 - " + " " + number1);

        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The largest number is number2 - " + " " + number2);

        } else if (number3 > number1 && number3 > number2) {
            System.out.println("The largest number is number3 - " + " " + number3);
        }
    }
}
