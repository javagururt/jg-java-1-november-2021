package student_valeriia_kulikova.Lesson_2.level_1_intern;

import java.util.Scanner;

public class Task_1 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("write the FIRST number and press ENTER");
        int firstNumber = scanner.nextInt();

        System.out.println("write the SECOND number and press ENTER");
        int secondNumber = scanner.nextInt();

        int Сумма = firstNumber + secondNumber;
        int Вычитание = firstNumber - secondNumber;
        int Умножение = firstNumber * secondNumber;
        int Деление = firstNumber / secondNumber;

        System.out.println("Сумма = " + Сумма);
        System.out.println("Вычитание = " + Вычитание);
        System.out.println("Умножение = " + Умножение);
        System.out.println("Деление = " + Деление);
    }
}
