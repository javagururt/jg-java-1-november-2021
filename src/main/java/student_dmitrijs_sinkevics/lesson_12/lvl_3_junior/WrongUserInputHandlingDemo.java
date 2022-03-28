package student_dmitrijs_sinkevics.lesson_12.lvl_3_junior;

import java.util.Scanner;

public class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean isInteger = false;

        while (!isInteger) {
            System.out.println("Please enter integer: ");
            String input = keyboard.nextLine();
            if (!isNumber(input)) {
                System.err.println("Not integer");
            } else{
                isInteger = true;
                System.out.println("Thanks!");
            }
        }
    }

    public static boolean isNumber(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double i = Double.parseDouble(strNum);
        } catch (NumberFormatException i) {
            return false;
        }
        return true;
    }
}
