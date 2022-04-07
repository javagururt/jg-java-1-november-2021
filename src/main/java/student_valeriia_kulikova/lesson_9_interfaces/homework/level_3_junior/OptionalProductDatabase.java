package student_valeriia_kulikova.lesson_9_interfaces.homework.level_3_junior;

import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface OptionalProductDatabase {
    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
