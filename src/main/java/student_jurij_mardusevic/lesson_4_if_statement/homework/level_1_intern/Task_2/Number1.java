package student_jurij_mardusevic.lesson_4_if_statement.homework.level_1_intern.Task_2;

import java.util.Scanner;

class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");

        int number = scanner.nextInt();


        if (number > 0){
            System.out.println("Number is positive");
        } else if (number == 0){
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is negative");
        }
    }
}

