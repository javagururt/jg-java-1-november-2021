package student_dmitrijs_sinkevics.lesson_9.lvl_3_junior;

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
