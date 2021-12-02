package teacher.lesson_2_variables.lessoncode;

import java.util.Scanner;

class UserNameInput {

    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Your name:");
        System.out.println(name);
    }
}
