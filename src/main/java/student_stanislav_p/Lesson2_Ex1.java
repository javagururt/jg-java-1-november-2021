package student_stanislav_p;

import java.util.Scanner;

public class Lesson2_Ex1 {

        public static void main(String [] args) {

            int Sum, Min, Mult, Div;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число ->");
            int Num1 = scanner.nextInt();

            System.out.println("Введите второе число (меньше первого) ->");
            int Num2 = scanner.nextInt();


            Sum = Num1 + Num2;
            Min = Num1 - Num2;
            Mult = Num1 * Num2;
            Div = Num1 / Num2;

            System.out.println(Num1 + " + " + Num2 + " = " + Sum);
            System.out.println(Num1 + " - " + Num2 + " = " + Min);
            System.out.println(Num1 + " * " + Num2 + " = " + Mult);
            System.out.println(Num1 + " / " + Num2 + " = " + Div);
        }

}
