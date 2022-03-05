package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.UI;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface UIAction {

    void execute();

    String getMenuName();
}
