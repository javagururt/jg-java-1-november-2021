package student_rolands_gudels.lesson4_if_statement.level_2_intern;

import java.util.Scanner;

 class Task_7 {
    /*Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны*/
    public static void main(String[] args) {
        System.out.println("Please enter two integer numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x!=y) {
            System.out.println("Numbers are different");
        } else if  (x==y) {
            System.out.println("Numbers are equals");
        }
    }
}
