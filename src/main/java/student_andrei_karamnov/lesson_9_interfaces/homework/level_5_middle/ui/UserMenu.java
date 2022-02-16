package student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.ui;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class UserMenu {

    private final MenuCommand[] commands;

    public UserMenu(MenuCommand[] commands) {
        this.commands = commands;
    }

    public void startUserMenu() {
        while (true) {
            for (int i = 0; i < commands.length; i++) {
                System.out.println(i + ". " + commands[i].getMenuName());
            }
            System.out.println("Make your choice:");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            commands[userInput].executeCommand();
        }
    }
}
