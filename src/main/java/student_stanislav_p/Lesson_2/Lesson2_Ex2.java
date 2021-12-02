package student_stanislav_p.Lesson_2;

import java.util.Scanner;

public class Lesson2_Ex2 {

        public static void main(String [] args) {

           double Sum, Min, Mult, Div;

            Scanner scanner = new Scanner(System.in);


            System.out.println("Введите первое число ->");

            double Num1 = scanner.nextDouble();

            System.out.println("Введите второе число (меньше первого) ->");

            double Num2 = scanner.nextDouble();



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
