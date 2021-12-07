package student_julija_radchenko.lesson2.homeworks;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Please enter first fractional number");

        Scanner input = new Scanner(System.in);
        double firstNumber = input.nextDouble();

        System.out.println("Please enter second fractional number");
        Scanner secondInput = new Scanner(System.in);
        double secondNumber = input.nextDouble();

        double sumResult = firstNumber + secondNumber;
        System.out.println("Sum result:" + sumResult);

        double subtractResult = firstNumber - secondNumber;
        System.out.println("Subtract result: " + subtractResult);

        double multiplyResult = firstNumber * secondNumber;
        System.out.println("Multiply result: " + multiplyResult);

        double divideResult = firstNumber / secondNumber;
        System.out.println("Divide result: " + divideResult);
    }
}
