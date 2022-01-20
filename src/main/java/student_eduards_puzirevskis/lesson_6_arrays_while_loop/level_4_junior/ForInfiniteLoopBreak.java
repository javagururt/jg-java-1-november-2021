package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_4_junior;

import java.util.Scanner;

class ForInfiniteLoopBreak {
     public static void main(String[] args) {
         System.out.println("OK. Type me any even integer!");
         for (int i = 0; i > -1; i++) {
             Scanner scanner = new Scanner(System.in);
             int userInput = scanner.nextInt();
             if (userInput % 2 == 1) {
                 int countOfAttempts = i + 1;
                 if (countOfAttempts == 1) {
                     System.out.println("You have tried " + countOfAttempts + " time");
                 } else {
                     System.out.println("You have tried " + countOfAttempts + " times");
                 }
             } else {
                 System.out.println("Nice. See ya");
                 break;
             }
         }
     }
}
