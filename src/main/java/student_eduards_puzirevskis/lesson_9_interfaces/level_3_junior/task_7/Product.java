package student_eduards_puzirevskis.lesson_9_interfaces.level_3_junior.task_7;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Product {
    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
