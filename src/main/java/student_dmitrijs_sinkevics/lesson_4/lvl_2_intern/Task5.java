package student_dmitrijs_sinkevics.lesson_4.lvl_2_intern;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two integers");
        int inputValue = keyboard.nextInt();
        int inputValue2 = keyboard.nextInt();

        if (inputValue>inputValue2){
            System.out.println("Maximum is "+inputValue);
        } else if (inputValue2>inputValue) {
            System.out.println("Maximum is "+inputValue2);
        } else {
            System.out.println("Integers must be different, try again");
        }

    }
}