package student_mihails_nikolajevs.lesson_4.level_2_intern_;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.

 */
public class Task5_ {

    public static void main(String[] args) {

        System.out.println("Please Enter Two Integer Numbers : ");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2)

            System.out.println("Your Integer First number: " + number1 + " -> More Than The Second Number: " + number2);

        else if (number1 < number2)

            System.out.println("Your Integer Second number: " + number2 + " -> More Than The First Number: " + number1);
    }


}
