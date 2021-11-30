package student_valeriia_kulikova.Lesson_2;

import java.util.Scanner;

public class Lesson2_Ex2 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("write the FIRST number and press ENTER");
        System.out.println("-->");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("write the SECOND number and press ENTER");
        System.out.println("-->");
        double secondDoubleNumber = scanner.nextDouble();
        double Сумма, Вычитание, Умножение, Деление;

        Сумма = firstDoubleNumber + secondDoubleNumber;
        Вычитание = firstDoubleNumber - secondDoubleNumber;
        Умножение = firstDoubleNumber * secondDoubleNumber;
        Деление = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Сумма = " + Сумма);
        System.out.println("Вычитание = " + Вычитание);
        System.out.println("Умножение = " + Умножение);
        System.out.println("Деление = " + Деление);
    }
}
