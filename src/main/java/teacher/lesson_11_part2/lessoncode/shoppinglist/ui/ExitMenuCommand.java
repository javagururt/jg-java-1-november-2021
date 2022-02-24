package teacher.lesson_11_part2.lessoncode.shoppinglist.ui;

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
