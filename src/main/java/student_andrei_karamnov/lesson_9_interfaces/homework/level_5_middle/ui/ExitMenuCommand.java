package student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.ui;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
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
