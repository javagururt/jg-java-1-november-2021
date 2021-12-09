package student_eduards_puzirevskis.lesson_2_variables.level_1_intern;

import java.util.Scanner;

public class MathActByYourNumber {

    public static void main(String[] args) {

        System.out.println("Simple math actions ");

        Scanner scan = new Scanner(System.in);

        System.out.print("Please, enter first number here : ");
        int a = scan.nextInt();
        System.out.print("Please, enter second number here : ");
        int b = scan.nextInt();

        int sum = a + b;
        int subtraction = a - b;
        int reverseSubtraction = b - a;
        int multiply = a * b;
        int division = a / b;
        int reverseDivision = b / a;

        System.out.println(" Your results : ");
        System.out.println("A + B = " + sum );
        System.out.println("A - B = " + subtraction);
        System.out.println("B - A = " + reverseSubtraction);
        System.out.println("A * B = " + multiply);
        System.out.println("A / B = " + division);
        System.out.println("B / A = " + reverseDivision);

    }
}
