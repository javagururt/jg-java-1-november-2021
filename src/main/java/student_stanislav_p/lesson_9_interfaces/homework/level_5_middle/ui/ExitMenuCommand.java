package student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.ui;

public class ExitMenuCommand implements MenuCommand {
    @Override
    public void executeCommand() {
        System.out.println("Goodbye");
        System.exit(0);
    }

    @Override
    public String getMenuName() {
        return "Exit";
    }
}
