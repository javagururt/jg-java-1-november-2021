package student_valeriia_kulikova;

import java.util.Scanner;

public class Lesson2_Ex1 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("write the FIRST number and press ENTER");
        System.out.println("-->");
        int firstNumber = scanner.nextInt();

        System.out.println("write the SECOND number and press ENTER");
        System.out.println("-->");
        int secondNumber = scanner.nextInt();
        int Сумма, Вычитание, Умножение, Деление;

        Сумма = firstNumber + secondNumber;
        Вычитание = firstNumber - secondNumber;
        Умножение = firstNumber * secondNumber;
        Деление = firstNumber / secondNumber;

        System.out.println("Сумма = " + Сумма);
        System.out.println("Вычитание = " + Вычитание);
        System.out.println("Умножение = " + Умножение);
        System.out.println("Деление = " + Деление);
    }
}
