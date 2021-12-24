package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Scanner;

class WhileLoopExample2 {

    public static void main(String[] args) {
        int loginAttempts = 1;

        while (isIncorrectPassword()) {
            loginAttempts++;
        }

        System.out.println("Login attempts = " + loginAttempts);
    }

    private static boolean isIncorrectPassword() {
        return !getUserInput().equals("12345");
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter pwd:");
        return scanner.nextLine();
    }
}
