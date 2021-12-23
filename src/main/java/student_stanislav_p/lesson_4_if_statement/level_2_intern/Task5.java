package student_stanislav_p.lesson_4_if_statement.level_2_intern;


import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число (целое и больше нуля) ->");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число (целое и больше нуля) ->");
        int number2 = scanner.nextInt();


        if ( number1 > number2 ){
            System.out.println("Первое число " + number1 +" больше чем второе число " +number2);
        } else {
            System.out.println("Второе число " + number2 +" больше чем первое число " +number1);
        }

    }
}
