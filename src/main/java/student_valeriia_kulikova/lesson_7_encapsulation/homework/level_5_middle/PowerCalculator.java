package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_5_middle;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number, please: ");
        int number = scanner.nextInt();
        System.out.println("Enter the number of degree, please: ");
        int number2 = scanner.nextInt();
        int calculator = (int) Math.pow(number,number2);
        System.out.println("The number " + number + " of degree " + number2 + " = " + calculator);
    }

    public int Calculate () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number, please: ");
        int number = scanner.nextInt();
        System.out.println("Enter the number of degree, please: ");
        int number2 = scanner.nextInt();
        int calculateNumbers = 1;
        for (int i = 1; i <= number2; i++) {
            calculateNumbers = calculateNumbers * number;
        }
        System.out.println("The number " + number + " of degree " + number2 + " = " + calculateNumbers);
        return number;


    }
}