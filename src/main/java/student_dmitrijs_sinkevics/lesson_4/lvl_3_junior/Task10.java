package student_dmitrijs_sinkevics.lesson_4.lvl_3_junior;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three integers");
        int inputValue = keyboard.nextInt();
        int inputValue2 = keyboard.nextInt();
        int inputValue3 = keyboard.nextInt();

        if (inputValue > inputValue2 && inputValue > inputValue3) {
            System.out.println("Number "+ inputValue+" is largest");
        } else if (inputValue2 > inputValue && inputValue2 > inputValue3) {
            System.out.println("Number "+ inputValue2+" is largest");
        } else if (inputValue3 > inputValue && inputValue3 > inputValue2)  {
            System.out.println("Number "+ inputValue3+" is largest");
        } else if (inputValue == inputValue2 || inputValue == inputValue3 || inputValue2 == inputValue3) {
            System.out.println("Integers must be different, try again");
        }
    }
}
