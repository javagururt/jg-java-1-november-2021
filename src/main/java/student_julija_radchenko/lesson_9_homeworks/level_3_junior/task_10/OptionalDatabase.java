package student_julija_radchenko.lesson_9_homeworks.level_3_junior.task_10;

import java.util.Optional;

public interface OptionalDatabase {

    void save(OptionalProduct product);

    Optional<OptionalProduct> findByTitle(String productTitle);
}
