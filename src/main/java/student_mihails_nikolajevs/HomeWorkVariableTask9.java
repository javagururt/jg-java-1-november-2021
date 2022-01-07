package student_mihails_nikolajevs;
/*Напишите программу, которая запрашивает у пользователя целое число
        и печатает на консоль таблицу умножения для этого числа до 10.

        Test Data:
        Input a number: 8

        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80*
*/
import java.util.Scanner;

public class HomeWorkVariableTask9 {

    public static void main(String[] args) {


        int b1=1;
        int b2=2;
        int b3=3;
        int b4=4;
        int b5=5;
        int b6=6;
        int b7=7;
        int b8=8;
        int b9=9;
        int b10=10;
        int c1;
        int c2;
        int c3;
        int c4;
        int c5;
        int c6;
        int c7;
        int c8;
        int c9;
        int c10;

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Please Enter Whole Number ->" );

        Scanner input = new Scanner(System.in);
        int a = scanner.nextInt();


        c1 = a * b1;
        c2 = a * b2;
        c3 = a * b3;
        c4 = a * b4;
        c5 = a * b5;
        c6 = a * b6;
        c7 = a * b7;
        c8 = a * b8;
        c9 = a * b9;
        c10 = a * b10;

        System.out.println("Expected Output : ");

        System.out.println(  a + " * " + b1 + " = " + c1);
        System.out.println(  a + " * " + b2 + " = " + c2);
        System.out.println(  a + " * " + b3 + " = " + c3);
        System.out.println(  a + " * " + b4 + " = " + c4);
        System.out.println(  a + " * " + b5 + " = " + c5);
        System.out.println(  a + " * " + b6 + " = " + c6);
        System.out.println(  a + " * " + b7 + " = " + c7);
        System.out.println(  a + " * " + b8 + " = " + c8);
        System.out.println(  a + " * " + b9 + " = " + c9);
        System.out.println(  a + " * " + b10 + " = " + c10);


    }

}
