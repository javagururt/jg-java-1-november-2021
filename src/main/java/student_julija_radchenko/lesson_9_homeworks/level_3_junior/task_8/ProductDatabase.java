package student_julija_radchenko.lesson_9_homeworks.level_3_junior.task_8;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);
}
