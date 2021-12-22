package student_dima_talanov.lesson_4.level_3_junior;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        System.out.println("Enter the number:");
        number1 = num.nextInt();
        System.out.println("Enter the number:");
        number2 = num.nextInt();
        System.out.println("Enter the number:");
        number3 = num.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("The largest number is:" + " " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The largest number is:" + " " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("The largest number is:" + " " + number3);
        }
    }
}
