package student_rolands_gudels.lesson4_if_statement.level_1_intern;

import java.util.Scanner;

public class Task_2 {
    /*Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю. */
    public static void main(String[] args) {
        System.out.println("Please enter integer number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println("You entered positive number");
        } if (x == 0){
            System.out.println("You entered zero");
        } if (x < 0){
            System.out.println("You entered negative number");
        }
    }
}
