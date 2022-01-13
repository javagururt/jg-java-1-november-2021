package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_4_junior;

import java.util.Scanner;

/*
Создайте класс WhileInfiniteLoopBreak и в нём продемонстрируйте
выход из бесконечного цикла реализованного при помощи цикла while.
 */
 class WhileInfiniteLoopBreak {
     public static void main(String[] args) {
         while (true) {
             System.out.println("Please, enter any integer!");
             System.out.println("Type 0 to exit");
             Scanner scanner = new Scanner(System.in);
             int userNumber = scanner.nextInt();
             if (userNumber != 0) {
                 System.out.println("Nice, your number is: " + userNumber);
             } else {
                 System.out.println("Ok. See ya later.");
                 break;
             }
         }
     }
}
