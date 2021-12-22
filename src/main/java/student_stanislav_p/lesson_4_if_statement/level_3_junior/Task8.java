package student_stanislav_p.lesson_4_if_statement.level_3_junior;


import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number ->");
        int number1 = scanner.nextInt();

        System.out.println("Enter second number ->");
        int number2 = scanner.nextInt();

        System.out.println("Enter third number ->");
        int number3 = scanner.nextInt();


        if (number1 == number2 && number1 == number3) {
            System.out.println("Numbers are equals");
        } else if (number1 != number2 && number2 != number3 && number1 != number3) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }


         /* второй вариант


        if (number1 == number2 && number1 == number3) {
            System.out.println("Numbers are equals");
        } else if (number1 == number2) {
            System.out.println("Number1 and Number2 are equals");
        } else if (number2 == number3) {
            System.out.println("Number2 and Number3 are equals");
        } else if (number1 == number3) {
            System.out.println("Number1 and Number3 are equals");
        } else {
            System.out.println("Numbers are different");
        }

    }*/

    }
}
