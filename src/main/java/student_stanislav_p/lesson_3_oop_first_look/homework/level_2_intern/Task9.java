package student_stanislav_p.lesson_3_oop_first_look.homework.level_2_intern;

import java.util.Scanner;

public class Task9 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя пользователя -> ");
            String userName = scanner.nextLine();
            System.out.println(" ");

            System.out.println("Hello " + userName +" !");
        }
}
