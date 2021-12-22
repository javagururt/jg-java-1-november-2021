package student_valeriia_kulikova.lesson_4_if_statement.homework.level_2_intern;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, write the FIRST number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please, write the SECOND number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println("Numbers are different");
        } else if (firstNumber > secondNumber) {
            System.out.println("Numbers are different");
        } else if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        }
    }
}