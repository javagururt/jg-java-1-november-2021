package student_dmitrijs_sinkevics.lesson_4.lvl_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three integers");
        int inputValue = keyboard.nextInt();
        int inputValue2 = keyboard.nextInt();
        int inputValue3 = keyboard.nextInt();

        if (inputValue < inputValue2 && inputValue2 < inputValue3) {
            System.out.println("Increasing");
        } else if (inputValue > inputValue2 && inputValue2 > inputValue3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
