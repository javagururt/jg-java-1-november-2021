package student_rolands_gudels.lesson4_if_statement.level_2_intern;

import java.util.Scanner;

public class Task_6 {
    /*Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.*/
    public static void main(String[] args) {
        System.out.println("Please enter two integer numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x<y) {
            System.out.println("First entered number is smaller " + x);
        } else if  (x==y) {
            System.out.println("Sorry but first and second numbers are the same");
        } else {
            System.out.println("Second entered number is smaller " + y);
        }
    }
}
