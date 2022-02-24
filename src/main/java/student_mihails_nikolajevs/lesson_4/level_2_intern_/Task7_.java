package student_mihails_nikolajevs.lesson_4.level_2_intern_;
/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны
 */

import java.util.Scanner;

public class Task7_ {

    public static void main(String[] args) {

        System.out.println("Please Enter Two Integer Numbers : ");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

    if (number1 == number2) {
        System.out.println("Your Numbers are Equals!!!");
    }
       else if (number1<number2){
           System.out.println("Your Numbers are Different!");
        }
    else if  (number1>number2){
        System.out.println("Your Numbers arw Different!");
        }

    }
}

