package student_artyom_shvegzhda.lesson_9_interfaces.lessoncode.shoppinglist.ui;

import teacher.lesson_9_interfaces.lessoncode.shoppinglist.ui.MenuCommand;

public class ExitMenuCommand implements MenuCommand {
    @Override
    public void executeCommand() {
        System.out.println("Bye-bye");
        System.exit(0);
    }

    @Override
    public String getMenuName() {
        return "Exit";
    }
}
