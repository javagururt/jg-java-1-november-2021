package student_stanislav_p.Lesson_2;

import java.util.Scanner;

public class Lesson2_Ex11 {

        public static void main(String [] args) {

           double SredneeA;

            Scanner scanner = new Scanner(System.in);


            System.out.println("Введите первое целое число ->");

            int Num1 = scanner.nextInt();

            System.out.println("Введите второе целое число ->");

            int Num2 = scanner.nextInt();

            System.out.println("Введите третье целое число ->");

            int Num3 = scanner.nextInt();


            SredneeA = (Num1 + Num2 + Num3) / 3;

            System.out.println("Среднее арифмитическое  = " + SredneeA);

        }

}
