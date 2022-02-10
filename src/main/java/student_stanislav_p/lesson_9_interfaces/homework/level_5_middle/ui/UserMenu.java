package student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.ui;

import java.util.Scanner;

public class UserMenu {

            private final MenuCommand[] commands;

    public UserMenu(MenuCommand[] commands) {
        this.commands = commands;
    }

    public void startUserMenu() {
        while (true) {
            for (int i = 0; i < commands.length; i++) {
                System.out.println(i + " - " + commands[i].getMenuName());
            }
            System.out.println("Make your choice:");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
            commands[userInput].executeCommand();
        }
    }
}
