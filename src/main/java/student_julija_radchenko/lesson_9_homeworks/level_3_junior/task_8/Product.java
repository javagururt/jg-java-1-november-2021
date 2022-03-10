package student_julija_radchenko.lesson_9_homeworks.level_3_junior.task_8;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Product {
    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
