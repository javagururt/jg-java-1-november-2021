package student_rolands_gudels.homework.lesson2_variables.level_3;

import java.util.Scanner;

public class Task_9_TablicaUmnozenija {

    //Напишите программу, которая запрашивает у пользователя целое число
    //и печатает на консоль таблицу умножения для этого числа до 10.
    //
    //Test Data:
    //Input a number: 8
    //
    //Expected Output :
    //8 x 1 = 8
    //8 x 2 = 16
    //8 x 3 = 24
    //...
    //8 x 10 = 80
    public static void main(String[] args) {
        System.out.println("Please enter integer number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = 1;
        do {
            System.out.println(number+" x "+a +" = "+(number * a));
            a++;
        } while (a<=10);
        }




    }

