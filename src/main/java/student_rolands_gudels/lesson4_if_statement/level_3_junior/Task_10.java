package student_rolands_gudels.lesson4_if_statement.level_3_junior;

import java.util.Scanner;

public class Task_10 {
    /*Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.*/
    public static void main(String[] args) {
        System.out.println("Please enter three integer numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x>y&x>z){
            System.out.println(x+" is the biggest one");
        } else if (y>x&y>z) {
            System.out.println(y+" is the biggest one");
        } else if (z>x&z>y) {
            System.out.println(z+" is the biggest one");
        } else {
            System.out.println("Something went wrong or all three integer numbers are the same");
        }
    }
}
