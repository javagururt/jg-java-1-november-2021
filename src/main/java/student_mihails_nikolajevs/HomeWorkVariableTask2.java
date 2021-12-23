package student_mihails_nikolajevs;
/*Написать консольную программу, которая запрашивает у пользователя два вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble();

 */

    import java.util.Scanner;

        public class HomeWorkVariableTask2 {

        public static void main(String[] args) {
                double SUM;
                double MIN;
                double DIV;
                double MULT;

                Scanner scanner = new Scanner(System.in);
                System.out.println("Please Enter First Number with a Comma:");
                double a = scanner.nextDouble();

                System.out.println("Please Enter Second Number with a Comma:");
                double b = scanner.nextDouble();

                SUM = a + b;
                MIN = a - b;
                DIV = a / b;
                MULT = a * b;

                System.out.println("SUM: " + a + " + " + b );
                System.out.println("SUM= "  + SUM );
                System.out.println("MIN: " + a + " - " + b );
                System.out.println("MIN= "  + MIN);
                System.out.println("DIV: " + a + " / " + b );
                System.out.println("DIV= "  + DIV);
                System.out.println("MULT: "  + a + " * " + b );
                System.out.println("MULT= " + MULT);



    }



}
