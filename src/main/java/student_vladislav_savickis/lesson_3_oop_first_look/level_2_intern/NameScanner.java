package student_vladislav_savickis.lesson_3_oop_first_look.level_2_intern;

import java.util.Scanner;

class NameScanner {
    public static void main(String[] args) {
        String userName;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        userName = scanner.nextLine();

        System.out.println("Hi " + userName + "!");
    }
}
