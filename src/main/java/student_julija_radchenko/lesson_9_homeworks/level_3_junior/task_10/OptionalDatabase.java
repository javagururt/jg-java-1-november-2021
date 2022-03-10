package student_julija_radchenko.lesson_9_homeworks.level_3_junior.task_10;

import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface OptionalDatabase {

    void save(OptionalProduct product);

    Optional<OptionalProduct> findByTitle(String productTitle);
}
