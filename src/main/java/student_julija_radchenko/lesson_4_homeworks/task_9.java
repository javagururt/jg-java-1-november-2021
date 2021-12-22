package student_julija_radchenko.lesson_4_homeworks;

import java.util.Scanner;

public class task_9 {
    public static void main(String [] args){
        Scanner inputNumber = new Scanner (System.in);

        System.out.println("Please enter first number");
        int firstNumber = inputNumber.nextInt();

        System.out.println("Please enter second number");
        int secondNumber = inputNumber.nextInt();

        System.out.println("Please enter third number ");
        int thirdNumber = inputNumber.nextInt();

        if((firstNumber < secondNumber) && (secondNumber < thirdNumber)) {
            System.out.println("increasing");
        }else if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)) {
            System.out.println("decreasing");
        }else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
