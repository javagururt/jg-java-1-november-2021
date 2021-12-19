package student_eduards_puzirevskis.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
целое число от 1 до 7 и выводит на консоль соотметствующий
этому числу день недели.

Пример:
Ввод: 3
Вывод: Wednesday

Ввод: 5
Вывод: Friday
 */
class Task_3 {
    public static void main(String[] args) {
        System.out.println("HI! Let's check day of the week!");
        System.out.println("Type a number from 1 to 7 and I'll tell you, what the day is it)");
        System.out.println("If you are done, just type \"0\".");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int userDayOfTheWeek = scanner.nextInt();
            if (userDayOfTheWeek == 1) {
                System.out.println("Damn, it's only MONDAY :-(");
            } else if (userDayOfTheWeek == 2) {
                System.out.println("Got the club going up...");
                System.out.println("on TUESDAY!");
            } else if (userDayOfTheWeek == 3) {
                System.out.println("Oh, WEDNESDAY Addams. Cheerful)");
            } else if (userDayOfTheWeek == 4) {
                System.out.println("After rain on THURSDAY.");
                System.out.println("If it mean's smthg to you, u r definitely boomer");
            } else if (userDayOfTheWeek == 5) {
                System.out.println("Worst day in a year... ");
                System.out.println("FRIDAY The 13th");
            } else if (userDayOfTheWeek == 6) {
                System.out.println("NBC? Jimmy Fallon?");
                System.out.println("Right! SATURDAY Night Live");
            } else if (userDayOfTheWeek == 7) {
                System.out.println("Be prepared, that tomorrow new week starts");
                System.out.println("It's SUNDAY, so enjoy it)");
            } else if (userDayOfTheWeek < 0 || userDayOfTheWeek > 7) {
                System.out.println("We didn't agree on this. Choose from 1 to 7");
            } else  {
                System.out.println("Remember, every morning starts with coffee)");
                break;
            }
        }
    }
}
