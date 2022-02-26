package student_mihails_nikolajevs.lesson_4.level_1_intern_;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
целое число от 1 до 7 и выводит на консоль соответствующий
этому числу день недели.

Пример:
Ввод: 3
Вывод: Wednesday

Ввод: 5
Вывод: Friday

 */
public class Task3_ {

    public static void main(String[] args) {

        System.out.println("Please Enter Integer Number from 1 till 7 : ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number == 1) System.out.println("Today is Monday");
        if(number == 2) System.out.println("Today is Tuesday");
        if(number == 3) System.out.println("Today is Wednesday");
        if(number == 4) System.out.println("Today is Thursday");
        if(number == 5) System.out.println("Today is Friday");
        if(number == 6) System.out.println("Today is Saturday");
        if(number == 7) System.out.println("Today is Sunday");
    }
}
