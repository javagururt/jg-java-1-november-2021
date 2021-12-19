package student_dmitrijs_sinkevics.lesson_4.lvl_1_intern;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter integer");
        int inputValue = keyboard.nextInt();

        if (inputValue%2==0){
            System.out.println("Even integer");
        } else {
            System.out.println("Odd integer");
        }

    }
}