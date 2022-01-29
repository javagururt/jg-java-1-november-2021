package student_artyom_shvegzhda.lesson_5_arrays_for_loop.lessoncode;

import teacher.lesson_5_arrays_for_loop.lessoncode.UserInputService;

import java.util.Scanner;

class DoWhileExample {

    public static void main(String[] args) {
        int loginAttempts = 0;
        String userInput = null;

        UserInputService inputService = new UserInputService();
        do {
            userInput = inputService.getUserInput();
            loginAttempts++;
        } while (!userInput.equals("123"));

        System.out.println("Login attempts = " + loginAttempts);
    }

}
