package student_artyom_shvegzhda.lesson_9_interfaces.lessoncode.shoppinglist.ui;

import teacher.lesson_9_interfaces.lessoncode.shoppinglist.ui.MenuCommand;

import java.util.Scanner;

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
