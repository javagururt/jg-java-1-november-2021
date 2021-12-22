package student_jurij_mardusevic.lesson_4_if_statement.homework.level_3_junior.Task_8;

import java.util.Scanner;

class ThreeNumbers {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter three integers: ");

        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int number3 = keyboard.nextInt();

        if (number1 == number2 && number1 == number3) {
            System.out.println("All numbers are equal");
        } else if (number1 != number2 && number1 != number3 && number2 != number3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
