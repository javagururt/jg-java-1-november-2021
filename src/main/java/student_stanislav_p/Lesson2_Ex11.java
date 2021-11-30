package student_stanislav_p;

import java.util.Scanner;

public class Lesson2_Ex11 {

        public static void main(String [] args) {

           double SredneeA;

            Scanner scanner = new Scanner(System.in);


            System.out.println("Введите первое число ->");

            int Num1 = scanner.nextInt();

            System.out.println("Введите второе число ->");

            int Num2 = scanner.nextInt();

            System.out.println("Введите третье число ->");

            int Num3 = scanner.nextInt();


            SredneeA = (Num1 + Num2 + Num3) / 3;

            System.out.println("Среднее арифмитическое  = " + SredneeA);

        }

}
