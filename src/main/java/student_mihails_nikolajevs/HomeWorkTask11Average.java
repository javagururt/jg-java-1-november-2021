package student_mihails_nikolajevs;
/* Напишите программу, которая запрашивает у пользователя
        три целых числа и выводит их среднее арифметическое
        (складывает все числа и делит на их количество).

        Примечение: обратите внимание, что результат может быть дробным числом.
*/


import java.util.Scanner;

public class HomeWorkTask11Average {

    public static void main(String[] args) {


        double d;

        Scanner num = new Scanner(System.in);

        System.out.println(" Please Enter First Whole Number  -> ");
        int a = num.nextInt();

        System.out.println(" Please Enter Second WHole Number  -> ");
        int b = num.nextInt();

        System.out.println(" Please Enter Third Whole Number  -> ") ;
        int c = num.nextInt();


        d = (a+b+c)/3;
        System.out.println(" The Average of the Sum of Three Numbers -> " + d );


    }
}
