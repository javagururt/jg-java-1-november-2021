package student_mihails_nikolajevs.lesson_2_var.level_2_intern_;

import java.util.Scanner;

public class SimpleCalculatorDemo {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First Number: ");
        int a = scanner.nextInt();
        System.out.println("Please Enter Second Number: ");
        int b = scanner.nextInt();

        int userSumResult = calculator.sum(a,b);

        calculator.printSum(userSumResult);
    }

}
