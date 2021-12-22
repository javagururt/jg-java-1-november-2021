package student_jurij_mardusevic.lesson_4_if_statement.homework.level_3_junior.Task_9;

import java.util.Scanner;

class ThreeNumbers1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three integers: ");

        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int number3 = keyboard.nextInt();

        if (number1 < number2 && number2 < number3) {
            System.out.println("Increasing");
        } else if (number1 > number2 && number2 > number3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
