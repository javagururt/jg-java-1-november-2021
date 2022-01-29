package student_artyom_shvegzhda.lesson_5_arrays_for_loop.lessoncode;

import java.util.Scanner;

class WhileLoopExample3 {

    public static void main(String[] args) {
        int loginAttempts = 1;
        String userInput = "";

        while (!userInput.equals("123")) {
            userInput = getUserInput();
            loginAttempts++;
        }

        System.out.println("Login attempts = " + loginAttempts);
    }


    private static String getUserInput() {
        System.out.println("Please enter pwd: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
