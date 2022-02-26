package student_mihails_nikolajevs.lesson_4.level_3_junior_;
/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.

 */

import java.util.Scanner;

public class Task10_ {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter First Integer Number : ");
        int number1 = scanner.nextInt();
        System.out.println("Please Enter Second Integer Number : ");
        int number2 = scanner.nextInt();
        System.out.println("Please Enter Third Integer Number : ");
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("The First Number is the Greatest");
            System.out.println(number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The Second Number is the Greatest");
            System.out.println(number2);
        } else {
            System.out.println("The Third Number is the Greatest");
            System.out.println(number3);
        }
        if (number1 == number2 && number2 == number3) {
            System.out.println("All Numbers Are Equals!!!");

        }
    }
}