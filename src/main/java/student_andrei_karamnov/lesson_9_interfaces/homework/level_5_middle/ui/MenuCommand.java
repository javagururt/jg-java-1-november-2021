package student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.ui;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface MenuCommand {

    void executeCommand();

    String getMenuName();
}
